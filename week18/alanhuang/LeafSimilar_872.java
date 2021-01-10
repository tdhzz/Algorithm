import java.util.ArrayList;
import java.util.List;

/**
 * @Classname LeafSimilar_872
 * @Description  叶子相似的树
 * @Date 2021/1/10 21:30
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class LeafSimilar_872 {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> leaves1 = new ArrayList();
		List<Integer> leaves2 = new ArrayList();
		dfs(root1, leaves1);
		dfs(root2, leaves2);
		return leaves1.equals(leaves2);
	}

	public void dfs(TreeNode node, List<Integer> leafValues) {
		if (node != null) {
			if (node.left == null && node.right == null) {
				leafValues.add(node.val);
			}
			dfs(node.left, leafValues);
			dfs(node.right, leafValues);
		}
	}
}
