/**
 * @Classname RemoveDuplicates_26
 * @Description 26. 删除排序数组中的重复项
 * @Date 2020/12/13 17:10
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RemoveDuplicates_26 {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
