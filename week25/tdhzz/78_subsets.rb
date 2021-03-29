# @param {Integer[]} nums
# @return {Integer[][]}
def subsets(nums)
  (0..nums.size).flat_map{ |k| nums.combination(k).to_a }
end
