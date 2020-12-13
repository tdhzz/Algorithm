# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        res = 0
        cur = head # 设置游标
        while cur:
            res = res*2 + cur.val * 2**0
            cur = cur.next
        return res