import java.util.Arrays;

/**
 * @Classname ArrayPairSum_561
 * @Description 561. 数组拆分 I
 * @Date 2020/11/22 18:34
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ArrayPairSum_561 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}
}
