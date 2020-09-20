import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Solution_350
 * @Description 两个数组的交集 II
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Solution_350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> resultNum1 = new ArrayList<>();
		for (int a : nums1) {
			resultNum1.add(a);
		}
		int a[] = new int[resultNum1.size()];
		int temp = -1;
		for (int i = 0; i < nums2.length; i++) {
			if (resultNum1.contains(nums2[i])) {
				temp++;
				a[temp] = nums2[i];
				Integer x = nums2[i];
				resultNum1.remove(x);
			}
		}
		return Arrays.copyOf(a, temp + 1);
	}
}
