/**
 * @Classname GetHint_299
 * @Description TODO
 * @Date 2021/1/31 14:46
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GetHint_299 {
	public String getHint(String secret, String guess) {
		int len = secret.length();
		int[] cache = new int[10];
		int x = 0, y = 0;
		for (int i = 0; i < len; i++) {
			char cs = secret.charAt(i);
			char cg = guess.charAt(i);
			if (cs == cg) {
				x++;
			} else {
				if (cache[cs - '0']++ < 0) {
					y++;
				}
				if (cache[cg - '0']-- > 0) {
					y++;
				}
			}
		}
		return x + "A" + y + "B";
	}
}
