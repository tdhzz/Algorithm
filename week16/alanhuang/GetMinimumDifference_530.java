/**
 * @Classname GetMinimumDifference_530
 * @Description 二叉搜索树的最小绝对差
 * @Date 2020/12/27 19:59
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GetMinimumDifference_530 {
	int pre;
	int ans;

	public int getMinimumDifference(TreeNode root) {
		ans = Integer.MAX_VALUE;
		pre = -1;
		dfs(root);
		return ans;
	}

	public void dfs(TreeNode root) {
		if (root == null) {
			return;
		}
		dfs(root.left);
		if (pre == -1) {
			pre = root.val;
		} else {
			ans = Math.min(ans, root.val - pre);
			pre = root.val;
		}
		dfs(root.right);
	}
}
