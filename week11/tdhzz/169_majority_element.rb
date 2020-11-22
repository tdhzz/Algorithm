# @param {Integer[]} nums
# @return {Integer}
def majority_element(nums)
  arr = nums.inject([0, 0]) do |p, i|
    if i == p[0] 
      [i, p[1] + 1]
    elsif p[1] == 0 
      [i, 1]
    else 
      [p[0], p[1] - 1]
    end
  end
  arr.first
end
