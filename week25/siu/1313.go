package siu

func decompressRLElist(nums []int) []int {
	var times int
	var arr []int
	for i, t := range nums {
		if i%2 == 0 {
			times = t
		} else {
			for a := 0; a < times; a++ {
				arr = append(arr, t)
			}
		}
	}
	return arr
}
