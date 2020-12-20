/**
 * @Classname IsBalanced
 * @Description TODO
 * @Date 2020/12/20 21:38
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class IsBalanced {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		} else {
			return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
		}
	}

	public int height(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return Math.max(height(root.left), height(root.right)) + 1;
		}
	}
}
