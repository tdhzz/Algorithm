# @param {Integer[]} nums
# @return {Integer}
def find_shortest_sub_array(nums)
    freqs = nums.group_by do |x|
        x
    end.map do |k,v|
        [k, v.size()]
    end.to_h

    degree = freqs.values.max

    freqs.find_all do |k,v|
        v == degree
    end.map do |k,v|
        nums.rindex(k) - nums.index(k) + 1
    end.min
end
