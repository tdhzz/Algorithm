import java.util.ArrayList;
import java.util.List;

/**
 * @Classname BinaryTreePaths_257
 * @Description 二叉树的所有路径
 * @Date 2020/12/27 19:57
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class BinaryTreePaths_257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new ArrayList<String>();
		constructPaths(root, "", paths);
		return paths;
	}

	public void constructPaths(TreeNode root, String path, List<String> paths) {
		if (root != null) {
			StringBuffer pathSB = new StringBuffer(path);
			pathSB.append(Integer.toString(root.val));
			if (root.left == null && root.right == null) {  // 当前节点是叶子节点
				paths.add(pathSB.toString());  // 把路径加入到答案中
			} else {
				pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
				constructPaths(root.left, pathSB.toString(), paths);
				constructPaths(root.right, pathSB.toString(), paths);
			}
		}
	}
}
