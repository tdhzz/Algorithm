import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @Classname DaysBetweenDates_1360
 * @Description 1360. 日期之间隔几天
 * @Date 2020/11/29 19:05
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DaysBetweenDates_1360 {
	public int daysBetweenDates(String date1, String date2) {
		LocalDate startDate = LocalDate.parse(date1);
		LocalDate endDate = LocalDate.parse(date2);
		long daysDiff = ChronoUnit.DAYS.between(startDate, endDate);
		return Math.abs((int) daysDiff);
	}
}
