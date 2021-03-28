import java.util.Arrays;

/**
 * @Classname MaximumProduct_626
 * @Description TODO
 * @Date 2021/3/28 21:16
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MaximumProduct_628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
	}
}
