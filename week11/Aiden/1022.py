class Solution:
    def sumRootToLeaf(self, root: TreeNode) -> int:
        def f(r, s):
            if r:
                s = s * 2 + r.val
                if not r.left and not r.right:
                    return s
                return f(r.left, s) + f(r.right, s)
            return 0
        return f(root, 0)