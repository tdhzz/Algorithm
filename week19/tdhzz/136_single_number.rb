# @param {Integer[]} nums
# @return {Integer}
def single_number(nums)
  hash = {}
  nums.each {|num| hash[num] ? hash.delete(num) : hash[num] = 1}
  return hash.key(1)
end