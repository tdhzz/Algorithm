# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def binaryTreePaths(self, root: TreeNode) -> List[str]:
        def binaryTreePaths(root: TreeNode) -> List[str]:
            if not root:
                return []  # 如果当前是空则另一边是一棵二叉树，所以他的祖先不可能是叶子节点。
            if not root.left and not root.right:
                return [str(root.val)]  # 递归到这里有一条路径。
            return [str(root.val)+"->"+i for i in binaryTreePaths(root.left)+binaryTreePaths(root.right)]
        return binaryTreePaths(root)