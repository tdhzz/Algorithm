package siu

func findShortestSubArray(nums []int) int {
	m := make(map[int][]int)
	numsLen := len(nums)
	for i := 0; i < numsLen; i++ {
		m[nums[i]] = append(m[nums[i]], i)
	}

	d := 0
	for _, v := range m {
		if len(v) > d {
			d = len(v)
		}
	}

	res := numsLen
	for _, v := range m {
		if len(v) == d && v[len(v)-1]-v[0]+1 < res {
			res = v[len(v)-1] - v[0] + 1
		}
	}
	return res
}
