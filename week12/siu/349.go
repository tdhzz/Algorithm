package siu

import "sort"

func intersection(nums1 []int, nums2 []int) []int {
	sort.Ints(nums1)
	sort.Ints(nums2)

	i, j := 0, 0
	var res []int
	for i < len(nums1) && j < len(nums2) {
		x, y := nums1[i], nums2[j]
		if x == y {
			if len(res) == 0 || x > res[len(res)-1] {
				res = append(res, x)
			}
			i++
			j++
		} else if x > y {
			j++
		} else {
			i++
		}
	}
	return res
}
