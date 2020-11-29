# @param {Integer[]} nums
# @return {Integer[]}
def running_sum(nums)
    i = 0
    while i < nums.length - 1
      nums[i+1] = nums[i] + nums[i+1]
      i += 1
    end
    nums
end
