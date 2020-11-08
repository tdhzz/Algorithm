/**
 * @Classname ArrangeCoins_441
 * @Description 441. 排列硬币
 * @Date 2020/11/8 21:28
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ArrangeCoins_441 {
	public int arrangeCoins(int n) {
		return (int)(Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
	}
}

