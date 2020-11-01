/**
 * @Classname MinDepth_111
 * @Description 二叉树的最小深度
 * @Date 2020/11/1 12:14
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MinDepth_111 {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		int ans = Integer.MAX_VALUE;
		if (root.left != null) {
			ans = Math.min(minDepth(root.left), ans);
		}
		if (root.right != null) {
			ans = Math.min(minDepth(root.right), ans);
		}
		return ans + 1;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
