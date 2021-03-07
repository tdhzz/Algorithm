import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Classname UniqueOccurrences_1207
 * @Description TODO
 * @Date 2021/3/7 22:11
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class UniqueOccurrences_1207 {
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
		for (int x : arr) {
			occur.put(x, occur.getOrDefault(x, 0) + 1);
		}
		Set<Integer> times = new HashSet<Integer>();
		for (Map.Entry<Integer, Integer> x : occur.entrySet()) {
			times.add(x.getValue());
		}
		return times.size() == occur.size();
	}
}
