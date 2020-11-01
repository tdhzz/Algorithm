# @param {Integer} n
# @return {Integer[]}
def sum_zero(n)
  arr = []
  arr.push(0) if n.odd?
  (1..n/2).each do |i|
   arr.push(i, -i)
  end
  arr
end
