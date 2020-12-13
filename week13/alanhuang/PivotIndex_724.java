/**
 * @Classname PivotIndex_724
 * @Description 寻找数组的中心索引
 * @Date 2020/12/13 16:58
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PivotIndex_724 {
	public int pivotIndex(int[] nums) {
		int sum = 0, leftsum = 0;
		for (int x : nums) sum += x;
		for (int i = 0; i < nums.length; ++i) {
			if (leftsum == sum - leftsum - nums[i]) return i;
			leftsum += nums[i];
		}
		return -1;
	}
}
