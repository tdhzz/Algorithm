def diameter_of_binary_tree(root)
  return 0 if root.nil?
  
  @ans = 0
  depth(root)
  return @ans
end

def depth(node)
  return 0 if node.nil?
  l = depth(node.left)
  r = depth(node.right)
  @ans = [l + r, @ans].max
  return [l, r].max + 1
end
