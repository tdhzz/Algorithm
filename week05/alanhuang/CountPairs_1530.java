import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CountPairs_1530
 * @Description 好叶子节点对的数量
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CountPairs_1530 {
	int num = 0;
	int distance = 0;

	public int countPairs(TreeNode root, int distance) {
		this.distance = distance;
		dfs(root, new ArrayList<>(), 0);
		return num;

	}

	void dfs(TreeNode root, List<Integer> depthRecords, int curDepth) {
		if (root == null) {
			return;
		}
		// 遍历到叶子节点，记录下该叶子节点的深度
		if (root.left == null && root.right == null) {
			depthRecords.add(curDepth);
		}
		List<Integer> leftChildrenDep = new ArrayList<>(), rightChildrenDep = new ArrayList<>();
		// 遍历左右子节点，得到左右叶子节点的深度
		this.dfs(root.left, leftChildrenDep, curDepth + 1);
		this.dfs(root.right, rightChildrenDep, curDepth + 1);
		depthRecords.addAll(leftChildrenDep);
		depthRecords.addAll(rightChildrenDep);
		// 遍历当前左右子节点的深度，结合当前节点的深度判断是否符合条件
		for (Integer leftDep : leftChildrenDep) {
			for (Integer rightDep : rightChildrenDep) {
				if (leftDep + rightDep - curDepth * 2 <= distance) {
					num++;
				}
			}
		}
	}

	// Definition for a binary tree node.
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}