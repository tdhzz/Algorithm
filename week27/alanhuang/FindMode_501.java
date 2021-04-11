import java.util.ArrayList;
import java.util.List;

/**
 * @Classname FindMode_501
 * @Description TODO
 * @Date 2021/4/11 21:53
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FindMode_501 {
	List<Integer> answer = new ArrayList<Integer>();
	int base, count, maxCount;

	public int[] findMode(TreeNode root) {
		dfs(root);
		int[] mode = new int[answer.size()];
		for (int i = 0; i < answer.size(); ++i) {
			mode[i] = answer.get(i);
		}
		return mode;
	}

	public void dfs(TreeNode o) {
		if (o == null) {
			return;
		}
		dfs(o.left);
		update(o.val);
		dfs(o.right);
	}

	public void update(int x) {
		if (x == base) {
			++count;
		} else {
			count = 1;
			base = x;
		}
		if (count == maxCount) {
			answer.add(base);
		}
		if (count > maxCount) {
			maxCount = count;
			answer.clear();
			answer.add(base);
		}
	}
}
