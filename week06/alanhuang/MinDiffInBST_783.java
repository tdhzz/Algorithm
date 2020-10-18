import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Classname MinDiffInBST_783
 * @Description 二叉搜索树节点最小距离
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MinDiffInBST_783 {
	List<Integer> vals;
	public int minDiffInBST(TreeNode root) {
		vals = new ArrayList();
		dfs(root);
		Collections.sort(vals);

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < vals.size() - 1; ++i)
			ans = Math.min(ans, vals.get(i+1) - vals.get(i));

		return ans;
	}
	public void dfs(TreeNode node) {
		if (node == null) return;
		vals.add(node.val);
		dfs(node.left);
		dfs(node.right);
	}

	public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
}

