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
# @param {Integer} distance
# @return {Integer}
def count_pairs(root, distance)
  @result = 0
  
  dfs(root, distance)
  
  @result
end

def dfs(node, distance)
  if node.left == nil && node.right == nil
    return [0]
  end

  array = []
  
  l_array = []
  r_array = []
  l_array = dfs(node.left, distance) if node.left
  r_array = dfs(node.right, distance) if node.right
  
  for i in 0..(l_array.size - 1) do
    for j in 0..(r_array.size - 1) do
      if l_array[i] + 1 + r_array[j] + 1 <= distance
        @result += 1
      end
    end
  end
  
  array = (l_array + r_array).map { |el| el + 1 }

  array
end
