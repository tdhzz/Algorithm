/**
 * @Classname MinStartValue_1413
 * @Description 1413. 逐步求和得到正数的最小值
 * @Date 2020/11/15 21:00
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MinStartValue_1413 {
	public int minStartValue(int[] nums) {
		int standard = 1;
		while (standard > 0)
		{
			int sum = standard;
			for (int i = 0; i < nums.length; i++)
			{
				sum += nums[i];
				if (sum < 1)
				{
					break;
				}
				if (i == nums.length - 1)
				{
					return standard;
				}
			}
			standard++;
		}
		return 0;
	}
}
