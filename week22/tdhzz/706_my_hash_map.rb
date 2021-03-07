class Node
  attr_accessor :key, :value, :next
  def initialize(key, value)
    @key = key
    @value = value
    @next = nil
  end
end

class MyHashMap
  def initialize
    @size = 1024
    @store = Array.new(1024)
  end

  def put(key, value)
    index = key.hash % @size
    list = @store[index]
    if list
      node = find_node(list, key)
      if node
        node.value = value
      else
        new_node = Node.new(key, value)
        new_node.next = list
        @store[index] = new_node
      end
    else
      @store[index] = Node.new(key, value)
    end
  end

  def get(key)
    index = key.hash % @size
    list = @store[index]

    return -1 unless list

    node = find_node(list, key)
    node ? node.value : -1
  end

  def remove(key)
    index = key.hash % @size
    list = @store[index]

    return -1 unless list

    node = find_node(list, key)

    node ? @store[index] = remove_node(list, key) : -1
  end

  private

  def find_node(list, key)
    current = list
    while current
      return current if current.key == key

      current = current.next
    end

    nil
  end

  def remove_node(list, key)
    dummy = Node.new(0, 0)
    dummy.next = list

    previous = dummy
    current = list
    while current
      if current.key == key
        previous.next = current.next
      else
        previous = previous.next
      end

      current = current.next
    end

    dummy.next
  end
end
