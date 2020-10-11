/**
 * @Classname DayOfYear_1154
 * @Description 一年中的第几天
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DayOfYear_1154 {
	public int dayOfYear(String date) {
		// 切割年月日
		String[] time = date.split("-");

		int year = Integer.parseInt(time[0]);
		int month = Integer.parseInt(time[1]);
		int day = Integer.parseInt(time[2]);

		// 每个月的天数
		int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 闰年的时候，把二月时间改完 29天
		if (isLeapYear(year)) {
			daysOfMonth[1] = 29;
		}

		int sum = day;

		// 计算当月前的天数
		for (int i = 0; i < (month - 1); i++) {
			sum += daysOfMonth[i];
		}

		return sum;
	}

	/**
	 * 是否闰年
	 *
	 * @param year 年份
	 * @return 是否闰年
	 */
	private boolean isLeapYear(int year) {

		// 四年闰，百年不闰
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}

		// 四百年闰
		return year % 400 == 0;
	}
}
