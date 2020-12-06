# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        def dfs(root):
            if not root: return 0, 0
            left, al = dfs(root.left)
            right, ar= dfs(root.right)
            return 1 + max(left, right), max(left + right, al, ar)
        return dfs(root)[1]