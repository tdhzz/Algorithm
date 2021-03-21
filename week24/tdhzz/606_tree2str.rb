# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} t
# @return {String}
def tree2str(t)
    return "" if t.nil?
    
    string = t.val.to_s
    string += "(#{tree2str(t.left)})" if t.left || t.right
    string += "(#{tree2str(t.right)})" if t.right
    
    string
end
