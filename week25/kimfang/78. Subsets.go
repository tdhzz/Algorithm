package kimfang
// 78. 子集
//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
//
//解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
//
//
//
//示例 1：
//
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//示例 2：
//
//输入：nums = [0]
//输出：[[],[0]]
//
//
//提示：
//
//1 <= nums.length <= 10
//-10 <= nums[i] <= 10
//nums 中的所有元素 互不相同
//通过次数217,373提交次数273,170
var ret [][]int

func subsets(nums []int) [][]int {
	if len(nums) == 0 {
		return make([][]int, 0)
	}
	ret = make([][]int, 0, len(nums))
	trace := make([]int, 0, len(nums))
	backTrace(nums, trace)
	return ret
}
func backTrace(nums []int, trace []int) {
	item := make([]int, len(trace))
	copy(item, trace)
	ret = append(ret, item)
	for i, n := range nums {
		trace = append(trace, n)
		if i < len(nums)-1 {
			backTrace(nums[i+1:], trace)
		}else {
			backTrace([]int{}, trace)
		}
		trace = trace[:len(trace)-1]
	}
}