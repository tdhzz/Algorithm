i# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def search_range(nums, target)
    starting = 0
    ending = nums.size - 1 
    while starting <= ending
      if nums[ending] == target && nums[starting] == target
        return [starting,ending]
      elsif nums[starting] == target || nums[ending] > target
        ending -= 1
      elsif nums[ending] == target || nums[starting] < target
        starting += 1
      end
    end
    [-1,-1]
end
