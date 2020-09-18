# Definition for a Node.
# class Node
#     attr_accessor :val, :children
#     def initialize(val)
#         @val = val
#         @children = []
#     end
# end

# @param {Node} root
# @return {int}
def maxDepth(root)
  return 0 if !root
  queue = [root]
  height = 0
  while !queue.empty? do
    queue.size.times do
      curr = queue.shift
      curr.children.each do |c|
        queue << c
      end
    end
    height += 1
  end
  height
end
