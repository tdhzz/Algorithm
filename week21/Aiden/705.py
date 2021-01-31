class Node:
    
    def __init__(self, val, nex):
        self.val = val
        self.nex = nex

class MyHashSet:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.size = 1000
        self.h = [Node(None, None) for _ in range(self.size)]

    def add(self, key: int) -> None:
        p = self.h[key % self.size]
        node = p.nex
        while node:
            if node.val == key:
                break
            p = node
            node = node.nex
        else:
            p.nex = Node(key, None)

    def remove(self, key: int) -> None:
        p = self.h[key % self.size]
        node = p.nex
        while node:
            if node.val == key:
                p.nex = node.nex
                break
            p = node
            node = node.nex

    def contains(self, key: int) -> bool:
        """
        Returns true if this set contains the specified element
        """
        node = self.h[key % self.size]
        while node:
            if node.val == key:
                return True
            node = node.nex
        return False
