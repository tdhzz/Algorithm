class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        n = len(nums)
        val = n*(n+1)/2
        lack = val - sum(set(nums))
        rep = sum(nums) + lack - val
        return [int(rep),int(lack)]