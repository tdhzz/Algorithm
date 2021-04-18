import java.util.ArrayList;
import java.util.List;

/**
 * @Classname IncreasingBST_897
 * @Description TODO
 * @Date 2021/4/18 20:34
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class IncreasingBST_897 {
	public TreeNode increasingBST(TreeNode root) {
		List<Integer> vals = new ArrayList();
		inorder(root, vals);
		TreeNode ans = new TreeNode(0), cur = ans;
		for (int v: vals) {
			cur.right = new TreeNode(v);
			cur = cur.right;
		}
		return ans.right;
	}

	public void inorder(TreeNode node, List<Integer> vals) {
		if (node == null) return;
		inorder(node.left, vals);
		vals.add(node.val);
		inorder(node.right, vals);
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
