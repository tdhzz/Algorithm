# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {Integer[]} nums
# @return {TreeNode}
def sorted_array_to_bst(nums)
  return construct_tree(nums, 0, nums.length - 1)
end

def construct_tree(nums, left, right)
  return nil if left > right
  
  mid = ( left + right) / 2
  node = TreeNode.new(nums[mid])

  return node if left == right

  node.left = construct_tree(nums, left, mid - 1)
  node.right = construct_tree(nums, mid + 1, right)
  node
end

