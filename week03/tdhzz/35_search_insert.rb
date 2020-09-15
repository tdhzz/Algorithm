# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}

def search_insert(nums, target)
  length = nums.length
  return 0 if length.zero?
  left = 0
  right = length
  while (left < right) do
    mid = (right + left) >> 1
    if nums[mid] < target
      left = mid + 1
    else
      right = mid
    end
  end
  return left
end
