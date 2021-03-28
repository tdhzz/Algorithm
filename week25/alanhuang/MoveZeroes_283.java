/**
 * @Classname MoveZeroes_283
 * @Description TODO
 * @Date 2021/3/28 21:18
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MoveZeroes_283 {
	public void moveZeroes(int[] nums) {
		int n = nums.length, left = 0, right = 0;
		while (right < n) {
			if (nums[right] != 0) {
				swap(nums, left, right);
				left++;
			}
			right++;
		}
	}

	public void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}
}
