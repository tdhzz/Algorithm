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
# @return {Float[]}
def average_of_levels(root)
  stats = []
  stats_for_subtree(root, stats)
  stats.collect { |stat| stat.first / stat.last.to_f }
end

def stats_for_subtree(node, stats, depth = 0)
  if node
    stat = stats[depth] || [0, 0]
    stats[depth] = [stat.first + node.val, stat.last + 1]
    stats_for_subtree(node.left, stats, depth + 1)
    stats_for_subtree(node.right, stats, depth + 1)
  end
end
