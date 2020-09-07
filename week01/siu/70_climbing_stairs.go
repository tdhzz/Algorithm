package siu

func climbStairs(n int) int {
	arr := []int{1, 1}
	for i := 2; i <= n; i++ {
		arr = append(arr, arr[i-1]+arr[i-2])
	}
	return arr[n]
}
