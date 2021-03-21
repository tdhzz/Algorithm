import javax.swing.tree.TreeNode;

/**
@Classname Tree2str_606
@Description TODO
@Date 2021/3/21 19:22
@Author guangliang huang
@Copyright:2020 linkcm.com Inc. All rights reserved.
注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Tree2str_606 {
	//前序遍历
	TreeNode pre = null;

	public String tree2str(TreeNode t) {
		if (t == null) return "";
		StringBuilder sb = new StringBuilder();
		helper(t, pre, sb);
		return sb.substring(1, sb.length() - 1);
	}

	private void helper(TreeNode root, TreeNode pre, StringBuilder sb) {
		if (root == null) return;
		//前序遍历
		//1.如果当前节点为父节点的右子树且左子树为空，括号不能省略
		if (pre != null && pre.left == null && pre.right == root) {
			sb.append("()");
		}
		sb.append("(").append(root.val);
		pre = root;
		helper(root.left, pre, sb);
		helper(root.right, pre, sb);
		//遍历完当前节点后关闭括号
		sb.append(")");
	}
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
