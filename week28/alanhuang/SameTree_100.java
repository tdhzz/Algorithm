/**
 * @Classname SameTree_100
 * @Description TODO
 * @Date 2021/4/18 20:29
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SameTree_100 {
	boolean isSameTree(TreeNode root1, TreeNode root2) {
		// 都为空的话，显然相同
		if (root1 == null && root2 == null) return true;
		// 一个为空，一个非空，显然不同
		if (root1 == null || root2 == null) return false;
		// 两个都非空，但 val 不一样也不行
		if (root1.val != root2.val) return false;

		// root1 和 root2 该比的都比完了
		return isSameTree(root1.left, root2.left)
				&& isSameTree(root1.right, root2.right);
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

