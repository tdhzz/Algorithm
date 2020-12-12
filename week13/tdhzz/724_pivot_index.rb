# @param {Integer[]} nums
# @return {Integer}
def pivot_index(nums)
    array_sum = nums.sum
    count = 0
    for i in 0...nums.length
        return i if count==array_sum-count-nums[i]
        count += nums[i]
    end
    -1
end
