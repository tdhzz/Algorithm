package kimfang
// 220. 存在重复元素 III
//在整数数组 nums 中，是否存在两个下标 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值小于等于 t ，且满足 i 和 j 的差的绝对值也小于等于 ķ 。
//
//如果存在则返回 true，不存在返回 false。
//
//
//
//示例 1:
//
//输入: nums = [1,2,3,1], k = 3, t = 0
//输出: true
//示例 2:
//
//输入: nums = [1,0,1,1], k = 1, t = 2
//输出: true
//示例 3:
//
//输入: nums = [1,5,9,1,5,9], k = 2, t = 3
//输出: false
//通过次数30,664提交次数115,376
func containsNearbyAlmostDuplicate(nums []int, k int, t int) bool {
	length := len(nums)
	for i := 0 ; i < length ; i++{
		for j := i + 1 ; j < length ; j++{
			if abs(nums[j],nums[i]) <= t && j - i <= k{
				return true
			}
		}
	}
	return false
}
func abs(a,b int)int{
	if a >= b{
		return a - b
	}
	return b - a
}