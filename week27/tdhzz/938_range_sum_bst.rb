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
# @param {Integer} low
# @param {Integer} high
# @return {Integer}
def range_sum_bst(root, l, r)
  root.select {|n| l <= n && n <= r}.sum
end

class TreeNode
  include Enumerable
  
  def each(&block)
    yield self.val
    self.left.each(&block) if self.left
    self.right.each(&block) if self.right
  end
end
