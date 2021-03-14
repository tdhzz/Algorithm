/**
 * @Classname RestoreString_1528
 * @Description 1528. 重新排列字符串
 * @Date 2021/3/14 18:25
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RestoreString_1528 {
	public String restoreString(String s, int[] indices) {
		int length = s.length();
		char[] result = new char[length];

		for (int i = 0; i < length; i++) {
			result[indices[i]] = s.charAt(i);
		}
		return new String(result);
	}
}
