import java.util.HashMap;
import java.util.Map;

/**
 * @Classname IsIsomorphic_205
 * @Description 同构字符串
 * @Date 2020/12/27 20:00
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class IsIsomorphic_205 {
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> s2t = new HashMap<Character, Character>();
		Map<Character, Character> t2s = new HashMap<Character, Character>();
		int len = s.length();
		for (int i = 0; i < len; ++i) {
			char x = s.charAt(i), y = t.charAt(i);
			if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
				return false;
			}
			s2t.put(x, y);
			t2s.put(y, x);
		}
		return true;
	}
}
