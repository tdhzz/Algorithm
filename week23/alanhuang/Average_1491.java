/**
 * @Classname Average_1491
 * @Description 1491. 去掉最低工资和最高工资后的工资平均值
 * @Date 2021/3/14 19:00
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Average_1491 {
	public double average(int[] salary) {
		double sum = 0;
		double maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
		for (int num : salary) {
			sum += num;
			maxValue = Math.max(maxValue, num);
			minValue = Math.min(minValue, num);
		}
		return (sum - maxValue - minValue) / (salary.length - 2);
	}
}
