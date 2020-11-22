# @param {Integer[]} nums
# @return {Integer}
def array_pair_sum(nums)
    count = 0
    nums = nums.sort
    nums.each_with_index do |elem, index|
        if index % 2 == 0
            count += nums[index] 
        end
    end
    count
end
