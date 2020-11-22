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
def sum_root_to_leaf(root)
  vals = []
    
  get_vals(root, vals, '')
    
  calculate_sum(vals)
end

def get_vals(root, vals, curr_val)
  curr_val += root.val.to_s
  
  vals.push(curr_val) if root.left.nil? && root.right.nil?
    
  get_vals(root.left, vals, curr_val) if root.left
  get_vals(root.right, vals, curr_val) if root.right
end

def calculate_sum(vals)
  vals.reduce(0) { |sum, val| sum += val.to_i(2) }      
end
