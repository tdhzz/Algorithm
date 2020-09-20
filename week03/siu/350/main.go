package main

func main() {
	println(intersect([]int{1, 2, 2, 1}, []int{2, 2}))
}

func intersect(nums1 []int, nums2 []int) []int {
	var r []int
	if len(nums1) == 0 || len(nums2) == 0 {
		return r
	}
	nums1Map := make(map[int]int)
	for _, i := range nums1 {
		nums1Map[i]++
	}
	for _, i := range nums2 {
		if nums1Map[i] > 0 {
			r = append(r, i)
			nums1Map[i]--
		}
	}
	return r
}
