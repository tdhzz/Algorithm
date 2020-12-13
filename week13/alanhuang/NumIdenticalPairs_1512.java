/**
 * @Classname NumIdenticalPairs_1512
 * @Description 1512. 好数对的数目
 * @Date 2020/12/13 17:00
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class NumIdenticalPairs_1512 {
	public int numIdenticalPairs(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; ++i) {
			for (int j = i + 1; j < nums.length; ++j) {
				if (nums[i] == nums[j]) {
					++ans;
				}
			}
		}
		return ans;
	}
}
