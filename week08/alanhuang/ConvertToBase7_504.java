/**
 * @Classname ConvertToBase7_504
 * @Description 七进制数
 * @Date 2020/11/1 12:11
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ConvertToBase7_504 {
	public String convertToBase7(int num) {
		StringBuilder sb = new StringBuilder();
		int flag = num >= 0 ? 1 : -1;
		num = Math.abs(num);

		if (num == 0) {
			sb.append(0);
		}
		while (num != 0) {
			sb.append(num % 7);
			num = num / 7;
		}
		if (flag < 0) {
			sb.append("-");
		}
		return sb.reverse().toString();
	}
}
