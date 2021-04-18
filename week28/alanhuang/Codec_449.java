import java.util.ArrayDeque;

/**
 * @Classname Codec_449
 * @Description TODO
 * @Date 2021/4/18 20:36
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Codec_449 {
	public StringBuilder postorder(TreeNode root, StringBuilder sb) {
		if (root == null) {
			return sb;
		}
		postorder(root.left, sb);
		postorder(root.right, sb);
		sb.append(root.val);
		sb.append(' ');
		return sb;
	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuilder sb = postorder(root, new StringBuilder());
		if (sb.length() > 0)
			sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	public TreeNode helper(Integer lower, Integer upper, ArrayDeque<Integer> nums) {
		if (nums.isEmpty())
			return null;
		int val = nums.getLast();
		if (val < lower || val > upper)
			return null;

		nums.removeLast();
		TreeNode root = new TreeNode(val);
		root.right = helper(val, upper, nums);
		root.left = helper(lower, val, nums);
		return root;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if (data.isEmpty())
			return null;
		ArrayDeque<Integer> nums = new ArrayDeque<Integer>();
		for (String s : data.split("\\s+"))
			nums.add(Integer.valueOf(s));
		return helper(Integer.MIN_VALUE, Integer.MAX_VALUE, nums);
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
