import java.util.HashMap;
import java.util.Map;

/**
 * @Classname SingleNumber_136
 * @Description TODO
 * @Date 2021/1/17 19:28
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SingleNumber_136 {
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : nums) {
			Integer count = map.get(i);
			count = count == null ? 1 : ++count;
			map.put(i, count);
		}
		for (Integer i : map.keySet()) {
			Integer count = map.get(i);
			if (count == 1) {
				return i;
			}
		}
		return -1; // can't find it.
	}
}
