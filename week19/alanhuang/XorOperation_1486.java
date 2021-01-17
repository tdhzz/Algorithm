/**
 * @Classname XorOperation_1486
 * @Description TODO
 * @Date 2021/1/17 19:25
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class XorOperation_1486 {
	public int xorOperation(int n, int start) {
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			ans ^= (start + i * 2);
		}
		return ans;
	}
}
