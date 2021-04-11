# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val = 0, left = nil, right = nil)
#         @val = val
#         @left = left
#         @right = right
#     end
# end
# @param {TreeNode} root
# @return {Integer[]}
def find_mode(root)
  counts = helper_method(root, {})
  counts.select {|k,v| v == counts.values.max }.keys
end

def helper_method(root, counts)
  if root
    helper_method(root.left, counts)
    counts[root.val] ||= 0
    counts[root.val] += 1
    helper_method(root.right, counts)
  end
  
  return counts
end
