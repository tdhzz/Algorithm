/**
 * @Classname SumRootToLeaf_1022
 * @Description 1022. 从根到叶的二进制数之和
 * @Date 2020/11/22 18:30
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SumRootToLeaf_1022 {
	int ans;

	public int sumRootToLeaf(TreeNode root) {
		sumbinary(root, 0);
		return ans;
	}

	public void sumbinary(TreeNode root, int cur) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			ans += cur * 2 + root.val;
			return;
		}
		sumbinary(root.left, cur * 2 + root.val);
		sumbinary(root.right, cur * 2 + root.val);
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

}

