import java.util.HashMap;
import java.util.Map;

/**
 * @Classname FirstUniqChar_387
 * @Description 387. 字符串中的第一个唯一字符
 * @Date 2021/1/31 14:48
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FirstUniqChar_387 {
	public int firstUniqChar(String s) {
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i < s.length(); ++i) {
			if (frequency.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
