# @param {Integer[]} nums
# @return {Integer}
def min_start_value(nums)
  min_val = initial = 0
  nums.each do |num|
    initial += num
    min_val = initial if initial < min_val
  end
  min_val.abs() + 1
end
