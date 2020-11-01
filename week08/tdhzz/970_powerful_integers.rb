# @param {Integer} x
# @param {Integer} y
# @param {Integer} bound
# @return {Integer[]}
def powerful_integers(x, y, bound)
  ans = []
  (0...20).each do |i|
    (0...20).each do |j|
      tmp = x**i + y**j
      ans.push(tmp) if tmp <= bound
    end
  end
  ans.sort.uniq
end
