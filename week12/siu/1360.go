package siu

import (
	"strconv"
	"strings"
)

// 基于蔡勒公式
func daysBetweenDatesForZeller(date1 string, date2 string) int {
	days := toDay(date1) - toDay(date2)
	if days < 0 {
		days = -days
	}
	return days
}

func toDay(date string) int {
	d := strings.Split(date, "-")
	year, _ := strconv.Atoi(d[0])
	month, _ := strconv.Atoi(d[1])
	day, _ := strconv.Atoi(d[2])

	// 蔡勒公式
	if month <= 2 {
		year--
		month += 10
	} else {
		month -= 2
	}

	return year*365 + year/4 - year/100 + year/400 + 30*month + (3*month-1)/5 + day // - K常数
}

// 将月份转化成天数

// 非闰年每月天数
var months = []int{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}

func daysBetweenDates(date1 string, date2 string) int {
	res := getDays(date1) - getDays(date2)
	if res < 0 {
		return -res
	}
	return res
}

func isLeap(year int) bool {
	return (year%400 == 0) || (year%100 != 0 && year%4 == 0)
}

func getDays(date string) int {
	d := strings.Split(date, "-")
	year, _ := strconv.Atoi(d[0])
	month, _ := strconv.Atoi(d[1])
	day, _ := strconv.Atoi(d[2])

	var days int
	if isLeap(year) && month > 2 {
		days = day // -1 闰年+1
	} else {
		days = day - 1
	}

	for month > 0 {
		month -= 1
		days += months[month]
	}

	days += year*365 + (year-1)/4 - (year-1)/100 + (year-1)/400

	return days
}
