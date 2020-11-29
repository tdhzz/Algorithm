package week_12

import (
	"strconv"
	"strings"
)

// 非闰年每月天数
var months = []int{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}

func daysBetweenDates(date1 string, date2 string) int {
	res := getDays(date2) - getDays(date1)
	if res < 0 {
		return -res
	}
	return res
}

func isLeap(year int) int {
	if (year%100 != 0 && year%4 == 0) || year%400 == 0 {
		return 1
	}
	return 0
}

func getDays(date string) int {
	d := strings.Split(date, "-")
	year, _ := strconv.Atoi(d[0])
	month, _ := strconv.Atoi(d[1])
	day, _ := strconv.Atoi(d[2])

	days := 0
	for y := 1971; y < year; y++ {
		days += isLeap(y) + 365
	}
	for m := 1; m < month; m++ {
		if m == 2 {
			days += isLeap(year) + 28
		} else {
			days += months[m]
		}
	}
	return days + day
}
