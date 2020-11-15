/**
 * @Classname BitwiseComplement_1009
 * @Description 1009. 十进制整数的反码
 * @Date 2020/11/15 19:10
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class BitwiseComplement_1009 {
	public int bitwiseComplement(int N) {
		if (N == 0) {
			return 1;
		}
		int i = 0;
		int n = N;
		while (N > 0) {
			i += 1;
			N = N >> 1;
		}
		int a = (int) Math.pow(2, i) - 1;
		return n ^ a;
	}
}
