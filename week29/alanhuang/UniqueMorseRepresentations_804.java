import java.util.HashSet;
import java.util.Set;

/**
 * @Classname UniqueMorseRepresentations_804
 * @Description 804. 唯一摩尔斯密码词
 * @Date 2021/5/5 15:04
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class UniqueMorseRepresentations_804 {

	public int uniqueMorseRepresentations(String[] words) {
		String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
				"....","..",".---","-.-",".-..","--","-.",
				"---",".--.","--.-",".-.","...","-","..-",
				"...-",".--","-..-","-.--","--.."};

		Set<String> seen = new HashSet();
		for (String word: words) {
			StringBuilder code = new StringBuilder();
			for (char c: word.toCharArray()) {
				code.append(MORSE[c - 'a']);
			}
			seen.add(code.toString());
		}

		return seen.size();
	}
}
