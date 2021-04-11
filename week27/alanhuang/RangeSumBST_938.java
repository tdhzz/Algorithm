/**
 * @Classname RangeSumBST_938
 * @Description TODO
 * @Date 2021/4/11 21:43
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RangeSumBST_938 {
	int ans;
	public int rangeSumBST(TreeNode root, int L, int R) {
		ans = 0;
		dfs(root, L, R);
		return ans;
	}

	public void dfs(TreeNode node, int L, int R) {
		if (node != null) {
			if (L <= node.val && node.val <= R)
				ans += node.val;
			if (L < node.val)
				dfs(node.left, L, R);
			if (node.val < R)
				dfs(node.right, L, R);
		}
	}
}
