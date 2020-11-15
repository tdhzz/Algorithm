/**
 * @Classname MaxSubArray_53
 * @Description 53. 最大子序和
 * @Date 2020/11/15 20:55
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MaxSubArray_53 {
	public int maxSubArray(int[] nums) {
		int ans = nums[0];
		int sum = 0;
		for(int num: nums) {
			if(sum > 0) {
				sum += num;
			} else {
				sum = num;
			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}
}
