/**
 * @Classname SearchInsert_35
 * @Description 搜索插入位置
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SearchInsert_35 {
	public int searchInsert(int[] nums, int target) {
		int n = nums.length;
		int i = 0;
		while (i < n) {
			if (nums[i] == target)
				return i;
			i++;
		}
		i = 0;
		while (i < n) {
			if (nums[i] < target)
				i++;
			else
				return i;
		}
		//返回数组nums的长度
		if (nums[n - 1] < target)
			return n;
		return 0;
	}
}
