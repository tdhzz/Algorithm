# @param {Integer[]} nums
# @return {Integer}
def find_max_consecutive_ones(nums)
    count = nums.join.split('0').max
    count.nil? ? 0 : count.length
end
