/**
 * @Classname PowerOfTow_231
 * @Description 2的幂
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PowerOfTow_231 {
	public boolean isPowerOfTwo(int n) {
		if(n == 0){
			return false;
		}
		while(n % 2 == 0){
			n /= 2;
		}
		return n == 1;
	}
}
