# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def getMinimumDifference(self, root: TreeNode) -> int:
        def dfs(root):
            if not root:
                return 
            dfs(root.left)
            nums.append(root.val)
            dfs(root.right)
        
        nums = []
        dfs(root)
        res = float('inf')
        for i in range(1, len(nums)):
            res = min(res, nums[i]-nums[i-1])
        return res