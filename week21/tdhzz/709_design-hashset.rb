class Node
    attr_accessor :value, :next # "Our Node class. Basically a single LinkedList"
    def initialize(value)
        self.value = value; #"The value will be the key from the HashSet"
        self.next = nil;  # "This is how we chain the nodes together in our buckets"
    end
end

class MyHashSet
    attr_accessor :set, :multiplier  # "Our getters and setters"
    def initialize()
        self.set = Array.new(); # "Our array, which grows dynamically when needed"
        self.multiplier = 123456 # "Our unique multiplier, this can be something else"
    end
    
    def add(key)
        actual_key = key % self.multiplier # "The actual key will be the index where our key(node.value) resides"
        if !self.contains(key)
           return self.set[actual_key] = Node.new(key)     #" If our set does not contain the key....set it as a new Node passing in the key, which in turn translates to our value...we also return right away to break out of the lines below"
        else
            head = self.set[actual_key] # "The following lines are specifically dealing with duplicates"
            while head != nil  # "This is how we traverse a single linked list"
                return if head.value == key  # "If any of the values are the key we return(break) out of the entire method"
                head = head.next # "Remember every node in the list is connected by the .next attribute on them"
            end

            newHead = Node.new(key)  # "If we made it this far, we have a hash collision, and we create a new node from the key to add it into our list"
            node = self.set[actual_key] # "Retrieve the current node at our unique index"
            newHead.next = node #"Set the new node's next pointer to the node on the line before
            self.set[actual_key] = node #"Update our linkedlist with the new longer linked list"
        end
    end

    def remove(key)
        actual_key = key % self.multiplier #"Our actual_key is our unique index"
        head = self.set[actual_key] #"Reference for the node at the unique index"
        return if head == nil #"If nothing is there, we have nothing to delete, and we return right away"
        newHead = nil #"Important attribute, we use this to create a newlist with ALL traces of the specific key eliminated. The following is specifically dealing with hash collisions...similar to above"

        head = head.next  if head.value == key # "If the first node's value is our key we skip right away"

        while (head != nil) # "We traverse the linkedlist and append all nodes to our new list that does not have the key we are seeking to remove"
            if head.value == key #"If it has the key skip it"
                head = head.next 
            elsif newHead == nil #If it does not have the key, we must create a newHead(variable created up top)"
                newHead = Node.new(head.value)
            else
                newHead.next = head #"If there are more values in the linkedlist we chain them to our newHead"
                head = head.next # "This is how we traverse linked lists"
            end
        end
        self.set[actual_key] = newHead # "We set the unique index to our newHead...which removed all traces of the key"
    end

    def contains(key)
        actual_key = key % self.multiplier 
        if self.set[actual_key] == nil #"If our unique index is equivalent to nil...it must not be in our HashSet"
            return false
        else
            head = self.set[actual_key] # "Grab a reference to the node at the unique index"
            while head != nil
                return true if head.value == key  #"Return True right away if any of the nodes values equal our key"
                head = head.next #"How we traverse a linked list"
            end
        end
        return false #"Since we checked every node in the linked list already....it must not be in our list and our HashSet"
    end
end

# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet.new()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)
