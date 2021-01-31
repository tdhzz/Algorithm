/**
 * @Classname CountCharacters_1160
 * @Description 1160. 拼写单词
 * @Date 2021/1/31 14:49
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CountCharacters_1160 {
	public int countCharacters(String[] words, String chars) {
		int[] chars_count = count(chars); // 统计字母表的字母出现次数
		int res = 0;
		for (String word : words) {
			int[] word_count = count(word); // 统计单词的字母出现次数
			if (contains(chars_count, word_count)) {
				res += word.length();
			}
		}
		return res;
	}

	// 检查字母表的字母出现次数是否覆盖单词的字母出现次数
	boolean contains(int[] chars_count, int[] word_count) {
		for (int i = 0; i < 26; i++) {
			if (chars_count[i] < word_count[i]) {
				return false;
			}
		}
		return true;
	}

	// 统计 26 个字母出现的次数
	int[] count(String word) {
		int[] counter = new int[26];
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			counter[c - 'a']++;
		}
		return counter;
	}

}
