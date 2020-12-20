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
# @return {Boolean}
def is_balanced(root)
    return true if !root
    is_balanced(root.left) && is_balanced(root.right) && (depth(root.left) - depth(root.right)).abs <= 1
end

def depth(root, depth = -1)
    return depth if !root
    left = depth(root.left, depth + 1)
    right = depth(root.right, depth + 1)
    return [left, right].max
end
