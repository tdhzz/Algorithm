# @param {Integer[]} nums
# @return {Boolean}
def check_possibility(nums)
    nums<<nums[-1]+5
    (0...nums.length-2).each do |i|
        if nums[i]>nums[i+1]
            if nums[i]>nums[i+2]
                nums[i]=nums[i+1]
            else
                nums[i+1]=nums[i]
            end
            break
        end
    end
    nums.pop
    nums==nums.sort 
end
