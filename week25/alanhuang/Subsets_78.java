import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Subsets_78
 * @Description TODO
 * @Date 2021/3/28 21:20
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Subsets_78 {
	List<Integer> t = new ArrayList<Integer>();
	List<List<Integer>> ans = new ArrayList<List<Integer>>();

	public List<List<Integer>> subsets(int[] nums) {
		int n = nums.length;
		for (int mask = 0; mask < (1 << n); ++mask) {
			t.clear();
			for (int i = 0; i < n; ++i) {
				if ((mask & (1 << i)) != 0) {
					t.add(nums[i]);
				}
			}
			ans.add(new ArrayList<Integer>(t));
		}
		return ans;
	}
}
