import java.util.ArrayList;
import java.util.List;

/**
 * @Classname FindDisappearedNumbers_448
 * @Description 448. 找到所有数组中消失的数字
 * @Date 2020/11/8 21:24
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FindDisappearedNumbers_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int tong[] = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			tong[nums[i]]++;
		}
		for (int i = 1; i < tong.length; i++) {
			if (tong[i] == 0) {
				list.add(i);
			}
		}
		return list;
	}
}
