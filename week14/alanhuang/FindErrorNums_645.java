/**
 * @Classname FindErrorNums_645
 * @Description 645. 错误的集合
 * @Date 2020/12/13 17:08
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FindErrorNums_645 {
	public int[] findErrorNums(int[] nums) {
		int dup = -1, missing = -1;
		for (int i = 1; i <= nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == i)
					count++;
			}
			if (count == 2)
				dup = i;
			else if (count == 0)
				missing = i;
		}
		return new int[] {dup, missing};
	}
}

