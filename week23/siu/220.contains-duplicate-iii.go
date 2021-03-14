package siu

//在整数数组 nums 中，是否存在两个下标 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值小于等于 t ，且满足 i 和 j 的差的
//绝对值也小于等于 ķ 。
//
// 如果存在则返回 true，不存在返回 false。
//
//
//
// 示例 1:
//
// 输入: nums = [1,2,3,1], k = 3, t = 0
//输出: true
//
// 示例 2:
//
// 输入: nums = [1,0,1,1], k = 1, t = 2
//输出: true
//
// 示例 3:
//
// 输入: nums = [1,5,9,1,5,9], k = 2, t = 3
//输出: false
// Related Topics 排序 Ordered Map
// 👍 305 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
func containsNearbyAlmostDuplicate(nums []int, k int, t int) bool {
	if t < 0 {
		return false
	}
	buckets := make(map[int]int)
	w := t + 1
	for i := range nums {
		key := keyFunc(nums[i], w)
		if _, ok := buckets[key]; ok {
			return true
		}
		if val, ok := buckets[key-1]; ok && absSubtract(nums[i], val) < w {
			return true
		}
		if val, ok := buckets[key+1]; ok && absSubtract(nums[i], val) < w {
			return true
		}
		buckets[key] = nums[i]
		if i >= k {
			delete(buckets, keyFunc(nums[i-k], w))
		}
	}
	return false
}

func absSubtract(a, b int) int {
	if a < b {
		return b - a
	}
	return a - b
}

func keyFunc(x, w int) int {
	if x < 0 {
		return (x+1)/w - 1
	} else {
		return x / w
	}
}

//leetcode submit region end(Prohibit modification and deletion)
