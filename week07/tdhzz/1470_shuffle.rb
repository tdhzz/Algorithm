# @param {Integer[]} nums
# @param {Integer} n
# @return {Integer[]}
def shuffle(nums, n)
    n.times.reduce([]) do |arr, i|
      arr << nums[i]
      arr << nums[i+n]
      arr
    end
end
