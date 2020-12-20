# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {Integer[][]}
def level_order_bottom(root)
    levels = []
    build_tree(root,0,levels)
    return levels.reverse
end

def build_tree(root,lvl,levels)
    return if root==nil
    levels[lvl]=[] if levels[lvl]==nil
    levels[lvl]<<root.val
    build_tree(root.left,lvl+1,levels)
    build_tree(root.right,lvl+1,levels)
end


