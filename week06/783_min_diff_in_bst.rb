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
def min_diff_in_bst(root)
  nodes = build_array(root).sort
  return 0 if nodes.length < 2
  min = (nodes[1]-nodes[0]).abs
  (1...nodes.length-1).each do |i|
    min = (nodes[i+1]-nodes[i]).abs if (nodes[i+1]-nodes[i]).abs < min
  end
  min    
end

def build_array(root) 
  return [] if root==nil
  return [root.val]+build_array(root.left)+build_array(root.right)
end
