class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total = sum(nums)
        part_sum = 0
        for i, j in enumerate(nums):
            if part_sum == (total - j) / 2:
                return i
            part_sum += j
        return -1