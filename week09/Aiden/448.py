class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:   
        for num in nums:
            nums[abs(num) - 1] = -abs(nums[abs(num) - 1])
        return [idx + 1 for idx, num in enumerate(nums) if num > 0]
