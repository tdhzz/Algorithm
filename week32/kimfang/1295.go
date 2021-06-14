package kimfang

import "strconv"

func findNumbers(nums []int) int {
	var count int
	for _, i := range nums{
		if len(strconv.Itoa(i)) % 2 == 0{
			count++
		}
	}
	return count
}