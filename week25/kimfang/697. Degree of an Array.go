package kimfang
// 697. 数组的度
//给定一个非空且只包含非负数的整数数组 nums，数组的度的定义是指数组里任一元素出现频数的最大值。
//
//你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
//
//
//
//示例 1：
//
//输入：[1, 2, 2, 3, 1]
//输出：2
//解释：
//输入数组的度是2，因为元素1和2的出现频数最大，均为2.
//连续子数组里面拥有相同度的有如下所示:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//最短连续子数组[2, 2]的长度为2，所以返回2.
//示例 2：
//
//输入：[1,2,2,3,1,4,2]
//输出：6
//
//
//提示：
//
//nums.length 在1到 50,000 区间范围内。
//nums[i] 是一个在 0 到 49,999 范围内的整数。
//通过次数58,838提交次数96,876

func findShortestSubArray(nums []int) int {
	// <key: 元素； val: [0]:次数,[1]:最左位置idx,[2]:最右idx>
	tmpMap := make(map[int][]int)
	m, ret := 0, 50000
	for i, n := range nums {
		list, ok := tmpMap[n]
		if !ok {
			// [0]:次数 [1]:最左位置idx [2]:最右idx
			list = []int{1, i, i}
			tmpMap[n] = list
		}else {
			list[0]++
			list[2] = i
		}
		m = max(m, list[0])
	}

	for _, v := range tmpMap {
		if m == v[0]	{
			ret = min(ret, v[2]-v[1]+1)
		}
	}
	return ret
}
func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}


