import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Classname ReverseWords_151
 * @Description 151. 翻转字符串里的单词
 * @Date 2021/5/5 15:13
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ReverseWords_151 {
	public String reverseWords(String s) {
		// 除去开头和末尾的空白字符
		s = s.trim();
		// 正则匹配连续的空白字符作为分隔符分割
		List<String> wordList = Arrays.asList(s.split("\\s+"));
		Collections.reverse(wordList);
		return String.join(" ", wordList);
	}

}
