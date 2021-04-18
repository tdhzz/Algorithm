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
# @return {Integer}
def max_depth(root)
    return 0 if root.nil?
    depth = 0
    queue = Array.new
    queue.push(root)
    while !queue.empty?
        depth += 1
        width = queue.size
        while width != 0
            node = queue.shift
            queue.push(node.left) unless node.left.nil?
            queue.push(node.right) unless node.right.nil?
            width -= 1
        end
    end
    depth 
end
