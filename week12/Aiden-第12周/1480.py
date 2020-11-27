class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        output = []
        temp = 0
        for i in nums:
            output.append(i+temp)
            temp += i
        return output