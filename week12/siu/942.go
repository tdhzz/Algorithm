package siu

func diStringMatch(S string) []int {
	left, right := 0, len(S)
	res := make([]int, 0, len(S)+1)
	for _, v := range S[:] {
		if v == 'I' {
			res = append(res, left)
			left++
		} else {
			res = append(res, right)
			right--
		}
	}
	res = append(res, left)
	return res
}
