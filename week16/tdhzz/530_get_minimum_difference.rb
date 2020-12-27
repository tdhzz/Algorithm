# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {Integer}
def get_minimum_difference(root)
    @min = nil
    @prev = nil
    inorder(root)
    @min
end

def inorder(root)
    return if root.nil?
    inorder(root.left)
    if @prev
        v = root.val - @prev
        @min = v if @min.nil? || v < @min
    end
    @prev = root.val
    inorder(root.right)
end
