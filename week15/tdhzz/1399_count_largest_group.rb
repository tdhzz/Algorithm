# @param {Integer} n
# @return {Integer}
def count_largest_group(n)
    h = {}
    number = -> x { x.digits.sum }
    (1..n).each do |i|
      size = number[i]
      h[size] ||= 0
      h[size] += 1
    end
    values = h.values
    max = values.max
    values.count(max)
end
