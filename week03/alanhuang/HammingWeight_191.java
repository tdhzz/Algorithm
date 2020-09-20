/**
 * @Classname HammingWeight_191
 * @Description 位1的个数
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class HammingWeight_191 {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((flag & n) != 0) {
				count++;
			}
			flag <<= 1;
		}
		return count;

	}
}
