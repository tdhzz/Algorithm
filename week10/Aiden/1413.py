class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        dp = [0 for i in range(len(nums))]
        for i in range(len(nums)):
            if i==0:
                dp[i]=nums[0]
            else:
                dp[i]=dp[i-1]+nums[i]
        return -min(dp)+1 if min(dp)<0 else 1
