import java.util.List;

/**
 * @Classname MaxDepth_559
 * @Description N叉树的最大深度
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MaxDepth_559 {
	public int maxDepth(Node root) {
		//判断节点是否为空
		if (root == null){
			return 0;
		}else if (root.children == null){
			return 1;
		}
		int hight = 0;
		//从第一层遍历搜索
		for (Node node : root.children){
			hight = Math.max(hight, maxDepth(node));
		}

		hight ++;
		return hight;
	}
}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}