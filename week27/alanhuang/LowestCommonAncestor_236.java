/**
 * @Classname LowestCommonAncestor_236
 * @Description TODO
 * @Date 2021/4/11 21:41
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class LowestCommonAncestor_236 {
	private Tree2str_606.TreeNode ans;

	public Solution() {
		this.ans = null;
	}

	private boolean dfs(Tree2str_606.TreeNode root, Tree2str_606.TreeNode p, Tree2str_606.TreeNode q) {
		if (root == null) return false;
		boolean lson = dfs(root.left, p, q);
		boolean rson = dfs(root.right, p, q);
		if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
			ans = root;
		}
		return lson || rson || (root.val == p.val || root.val == q.val);
	}

	public Tree2str_606.TreeNode lowestCommonAncestor(Tree2str_606.TreeNode root, Tree2str_606.TreeNode p, Tree2str_606.TreeNode q) {
		this.dfs(root, p, q);
		return this.ans;
	}

}
