/**
 * @Classname PowerOfFour
 * @Description TODO
 * @Date 2020/9/7 10:15
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PowerOfFour {
	public boolean isPowerOfFour(int num) {
		if(num == 0){
			return false;
		}
		while(num % 4 == 0){
			num /= 4;
		}
		return num == 1;
	}
}
