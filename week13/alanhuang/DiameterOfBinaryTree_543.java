/**
 * @Classname DiameterOfBinaryTree_543
 * @Description 543. 二叉树的直径
 * @Date 2020/12/5 20:05
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DiameterOfBinaryTree_543 {
	int diameter;
	public int diameterOfBinaryTree(TreeNode root) {
		diameter = 0;
		traverse(root);
		return diameter;

	}
	// 返回树的深度
	int traverse(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = traverse(root.left); // 左子树的深度
		int right = traverse(root.right); // 右子树的深度
		// 直接访问全局变量
		diameter = Math.max(diameter, left + right);
		return 1 + Math.max(left, right);
	}
}
