# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val = 0, left = nil, right = nil)
#         @val = val
#         @left = left
#         @right = right
#     end
# end
# @param {TreeNode} root1
# @param {TreeNode} root2
# @return {Boolean}
def leaf_similar(root1, root2)
    return leaf_seq(root1) == leaf_seq(root2)
end

def leaf_seq(node, seq=[])
    return [node.val] if node.left.nil? && node.right.nil?
    left = node.left.nil? ? [] : leaf_seq(node.left, seq)
    right = node.right.nil? ? [] : leaf_seq(node.right, seq)
    return seq+left+right
end
