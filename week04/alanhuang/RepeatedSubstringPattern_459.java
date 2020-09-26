/**
 * @Classname RepeatedSubstringPattern_459
 * @Description 重复的子字符串
 * @Date 2020/9/26 16:20
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RepeatedSubstringPattern_459 {

	public boolean repeatedSubstringPattern(String s) {
		int n = s.length();
		//KMP 算法
		for (int i = 1; i * 2 <= n; ++i) {
			if (n % i == 0) {
				boolean strMatch = true;
				for (int j = i; j < n; ++j) {
					if (s.charAt(j) != s.charAt(j - i)) {
						strMatch = false;
						break;
					}
				}
				if (strMatch) {
					return true;
				}
			}
		}
		return false;
	}
}
