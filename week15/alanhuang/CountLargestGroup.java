import java.util.HashMap;
import java.util.Map;

/**
 * @Classname CountLargestGroup
 * @Description TODO
 * @Date 2020/12/20 21:41
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CountLargestGroup {
	public int countLargestGroup(int n) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int maxValue = 0;
		for (int i = 1; i <= n; ++i) {
			int key = 0, i0 = i;
			while (i0 != 0) {
				key += i0 % 10;
				i0 /= 10;
			}
			hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
			maxValue = Math.max(maxValue, hashMap.get(key));
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> kvpair : hashMap.entrySet()) {
			if (kvpair.getValue() == maxValue) {
				++count;
			}
		}
		return count;
	}
}
