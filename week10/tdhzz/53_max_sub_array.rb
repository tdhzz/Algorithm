# @param {Integer[]} nums
# @return {Integer}
def max_sub_array(nums)
    arr = Array.new(0)
    arr[0] = nums[0]
    max_sum = arr[0]
    
    nums[1..-1].each_with_index do |num, idx|
        m = [num, num + arr[idx - 1]].max
        arr[idx] = m
        max_sum = [max_sum, m].max
    end
    
    max_sum
end
