/**
 * @Classname ClimbStairs
 * @Description TODO
 * @Date 2020/9/7 10:08
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ClimbStairs {
	public int climbStairs(int n) {
		int count = 0;
		int a = 1, b = 1;
		for(int i = 2; i<=n; i++){
			count = a + b;
			a = b;
			b = count;
		}
		return b;
	}
}
