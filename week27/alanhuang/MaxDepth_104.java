/**
 * @Classname MaxDepth_104
 * @Description TODO
 * @Date 2021/4/11 21:39
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MaxDepth_104 {
	public int maxDepth(Tree2str_606.TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int leftHeight = maxDepth(root.left);
			int rightHeight = maxDepth(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
}
