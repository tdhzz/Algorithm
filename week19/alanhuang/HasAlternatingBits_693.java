/**
 * @Classname HasAlternatingBits_693
 * @Description TODO
 * @Date 2021/1/17 19:27
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class HasAlternatingBits_693 {
	public boolean hasAlternatingBits(int n) {
		int second = n & 1;
		n = n >> 1;
		int first = n & 1;
		while(n != 0) {
			if(first == second) {
				return false;
			}else {
				second = first;
				n = n >> 1;
				first = n & 1;
			}
		}
		return true;
	}
}
