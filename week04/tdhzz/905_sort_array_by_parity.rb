# @param {Integer[]} a
# @return {Integer[]}
def sort_array_by_parity(a)
  a = a.group_by(&:even?).values.flatten
  a.first.even? ? a : a.reverse
end
