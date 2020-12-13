# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} head
# @return {Integer}
def get_decimal_value(head)
  result = head.val
  
  while head = head.next
    result = result << 1 | head.val
  end
  
  result
end
