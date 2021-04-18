/**
 * @Classname LongestUnivaluePath_687
 * @Description TODO
 * @Date 2021/4/18 20:35
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class LongestUnivaluePath_687 {
	int ans;
	public int longestUnivaluePath(TreeNode root) {
		ans = 0;
		arrowLength(root);
		return ans;
	}
	public int arrowLength(TreeNode node) {
		if (node == null) return 0;
		int left = arrowLength(node.left);
		int right = arrowLength(node.right);
		int arrowLeft = 0, arrowRight = 0;
		if (node.left != null && node.left.val == node.val) {
			arrowLeft += left + 1;
		}
		if (node.right != null && node.right.val == node.val) {
			arrowRight += right + 1;
		}
		ans = Math.max(ans, arrowLeft + arrowRight);
		return Math.max(arrowLeft, arrowRight);
	}

	public class TreeNode {
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
}
