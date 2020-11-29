# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Integer[]}
def intersection(nums1, nums2)
# nums1 & nums2
hash = nums1.reduce(Hash.new(0)) {|ha, num| ha[num] = 1; ha }
nums2.reduce([]){|ar, num| hash[num] == 1 && !ar.include?(num) ? ar << num : ar }
end
