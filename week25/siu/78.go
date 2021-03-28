package siu

func subsets(nums []int) [][]int {
	result := make([][]int, 0)
	result = append(result, []int{})
	path := make([]int, 0)
	dfs(nums, path, &result)
	return result
}

func dfs(nums []int, path []int, result *[][]int) {
	// 结束条件
	if len(nums) == 0 {
		return
	}
	// 每层复制保存
	for i := 0; i < len(nums); i++ {
		path := append(path, nums[i])
		pathTemp := make([]int, len(path))
		copy(pathTemp, path)
		*result = append(*result, pathTemp)
		dfs(nums[i+1:], path, result)
	}
}
