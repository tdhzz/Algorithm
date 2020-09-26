/**
 * @Classname CountBinarySubstrings_696
 * @Description 计数二进制子串
 * @Date 2020/9/26 16:44
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CountBinarySubstrings_696 {
	public int countBinarySubstrings(String s) {
		int length = s.length();
		int result = 0, count = 1, preIndex = 0;
		for (int i = 1; i < length; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				result += Math.min(count, preIndex);
				preIndex = count;
				count = 1;
			}
		}
		return result + Math.min(preIndex, count);
	}
}
