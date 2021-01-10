/**
 * @Classname SearchRange_34
 * @Description 在排序数组中查找元素的第一个和最后一个位置
 * @Date 2021/1/10 21:27
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SearchRange_34 {
	public int[] searchRange(int[] nums, int target) {
		int leftIdx = binarySearch(nums, target, true);
		int rightIdx = binarySearch(nums, target, false) - 1;
		if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
			return new int[]{leftIdx, rightIdx};
		}
		return new int[]{-1, -1};
	}

	public int binarySearch(int[] nums, int target, boolean lower) {
		int left = 0, right = nums.length - 1, ans = nums.length;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] > target || (lower && nums[mid] >= target)) {
				right = mid - 1;
				ans = mid;
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}
}

