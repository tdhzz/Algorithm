class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
         return sum(nums[idx+1:].count(nums[idx]) for idx in range(len(nums)-1))