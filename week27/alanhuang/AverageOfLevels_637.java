import java.util.ArrayList;
import java.util.List;

/**
 * @Classname AverageOfLevels_637
 * @Description TODO
 * @Date 2021/4/11 21:54
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class AverageOfLevels_637 {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Integer> counts = new ArrayList<Integer>();
		List<Double> sums = new ArrayList<Double>();
		dfs(root, 0, counts, sums);
		List<Double> averages = new ArrayList<Double>();
		int size = sums.size();
		for (int i = 0; i < size; i++) {
			averages.add(sums.get(i) / counts.get(i));
		}
		return averages;
	}

	public void dfs(TreeNode root, int level, List<Integer> counts, List<Double> sums) {
		if (root == null) {
			return;
		}
		if (level < sums.size()) {
			sums.set(level, sums.get(level) + root.val);
			counts.set(level, counts.get(level) + 1);
		} else {
			sums.add(1.0 * root.val);
			counts.add(1);
		}
		dfs(root.left, level + 1, counts, sums);
		dfs(root.right, level + 1, counts, sums);
	}
}
