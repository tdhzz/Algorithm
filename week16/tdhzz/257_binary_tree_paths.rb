# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {String[]}0-
def binary_tree_paths(root)
    return [] if root.nil?
    @paths = []
    path_to_leaf(nil, root)
    @paths
end

def path_to_leaf(path, node)
    #puts "node: #{node.inspect}"
    path = path.nil? ? node.val.to_s : "#{path}->#{node.val.to_s}" 
    path_to_leaf(path, node.left) if node.left
    path_to_leaf(path, node.right) if node.right
    if node.left.nil? && node.right.nil?
        @paths << path 
        return
    end
end
