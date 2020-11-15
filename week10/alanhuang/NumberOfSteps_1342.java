/**
 * @Classname NumberOfSteps_1342
 * @Description 1342. 将数字变成 0 的操作次数
 * @Date 2020/11/15 20:52
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class NumberOfSteps_1342 {
	public int numberOfSteps (int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = (num & 1) == 1 ? num & -2 : num >> 1;
		}
		return count;
	}
}
