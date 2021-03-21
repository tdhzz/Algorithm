/**
 * @Classname RemovePalindromeSub_1332
 * @Description TODO
 * @Date 2021/3/21 19:26
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RemovePalindromeSub_1332 {
	public int removePalindromeSub(String s) {
		if ("".equals(s)) return 0;
		if (s.equals(new StringBuilder(s).reverse().toString())) return 1;
		return 2;
	}
}
