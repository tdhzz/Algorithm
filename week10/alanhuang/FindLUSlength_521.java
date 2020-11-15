/**
 * @Classname FindLUSlength_521
 * @Description 521. 最长特殊序列 Ⅰ
 * @Date 2020/11/15 19:13
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FindLUSlength_521 {
	public int findLUSlength(String a, String b) {
		if (a.equals(b))
			return -1;
		return a.length() > b.length() ? a.length() : b.length();
	}
}
