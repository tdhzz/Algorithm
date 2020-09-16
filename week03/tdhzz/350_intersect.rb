# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Integer[]}

def intersect(nums1, nums2)
  res = []
  arr1, arr2 = nums1.dup, nums2.dup
  arr1.sort!
  arr2.sort!  

  until arr1.empty? || arr2.empty?
    if arr1[0] == arr2[0]
      res.push(arr1.shift)
      arr2.shift
    elsif arr1[0] < arr2[0]
      arr1.shift
    elsif arr2[0] < arr1[0]
      arr2.shift
    end
  end

  res
end
