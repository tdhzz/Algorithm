/**
 * @Classname IsCousins_993
 * @Description 二叉树的堂兄弟节点
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class IsCousins_993 {
	private TreeNode px;
	private TreeNode py;
	private int dx;
	private int dy;
	public boolean isCousins(TreeNode root, int x, int y) {
		preorder(root, x, y, null, 0);
		return px!=py && dx==dy;
	}

	private void preorder(TreeNode root, int x, int y, TreeNode p, int d){
		if(root==null){
			return;
		}
		if(root.val==x){
			px = p;
			dx = d;
		}
		if(root.val==y){
			py = p;
			dy = d;
		}
		preorder(root.left, x, y, root, d+1);
		preorder(root.right, x, y, root, d+1);
	}

	public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
}
