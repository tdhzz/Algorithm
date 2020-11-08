# @param {Integer[]} nums
# @return {Integer[]}
def find_disappeared_numbers(nums)
    (1..nums.length).to_a - nums
end
