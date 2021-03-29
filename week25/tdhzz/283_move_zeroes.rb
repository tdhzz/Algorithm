# @param {Integer[]} nums
# @return {Void} Do not return anything, modify nums in-place instead.
def move_zeroes(nums)
    l = nums.size
    nums.delete(0)
    nums.push(*([0]*(l - nums.size)))
end
