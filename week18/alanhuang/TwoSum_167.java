/**
 * @Classname TwoSum_167
 * @Description 两数之和 II - 输入有序数组
 * @Date 2021/1/10 21:31
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class TwoSum_167 {
	public int[] twoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; ++i) {
			int low = i + 1, high = numbers.length - 1;
			while (low <= high) {
				int mid = (high - low) / 2 + low;
				if (numbers[mid] == target - numbers[i]) {
					return new int[]{i + 1, mid + 1};
				} else if (numbers[mid] > target - numbers[i]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return new int[]{-1, -1};
	}
}
