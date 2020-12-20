import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Classname IsValid
 * @Description TODO
 * @Date 2020/12/20 21:36
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class IsValid {
	public boolean isValid(String s) {
		int n = s.length();
		if (n % 2 == 1) {
			return false;
		}

		Map<Character, Character> pairs = new HashMap<Character, Character>() {{
			put(')', '(');
			put(']', '[');
			put('}', '{');
		}};
		Deque<Character> stack = new LinkedList<Character>();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (pairs.containsKey(ch)) {
				if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
					return false;
				}
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();

	}
}
