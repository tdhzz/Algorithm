//给你一个按 YYYY-MM-DD 格式表示日期的字符串 date，请你计算并返回该日期是当年的第几天。
//
// 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
//
//
//
// 示例 1：
//
// 输入：date = "2019-01-09"
//输出：9
//
//
// 示例 2：
//
// 输入：date = "2019-02-10"
//输出：41
//
//
// 示例 3：
//
// 输入：date = "2003-03-01"
//输出：60
//
//
// 示例 4：
//
// 输入：date = "2004-03-01"
//输出：61
//
//
//
// 提示：
//
//
// date.length == 10
// date[4] == date[7] == '-'，其他的 date[i] 都是数字。
// date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日。
//
// Related Topics 数学
// 👍 28 👎 0
package main

//leetcode submit region begin(Prohibit modification and deletion)
func dayOfYear(date string) int {
	monthTable := []int{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	year := getYear(date)
	month := getMonth(date)
	day := getDay(date)
	res := 0

	if isLeapYear(year) {
		monthTable[2] = 29
	}
	for i := 1; i < month; i++ {
		res += monthTable[i]
	}
	res += day
	return res
}

func getYear(date string) int {
	return int(date[0]-'0')*1000 + int(date[1]-'0')*100 + int(date[2]-'0')*10 + int(date[3]-'0')
}
func getMonth(date string) int {
	return int(date[5]-'0')*10 + int(date[6]-'0')
}
func getDay(date string) int {
	return int(date[8]-'0')*10 + int(date[9]-'0')
}

func isLeapYear(year int) bool {
	if year%100 == 0 {
		if year%400 == 0 {
			return true
		}
		return false
	}
	if year%4 == 0 {
		return true
	}
	return false
}

//leetcode submit region end(Prohibit modification and deletion)
