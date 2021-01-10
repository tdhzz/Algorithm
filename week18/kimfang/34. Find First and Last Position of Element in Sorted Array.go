package kimfang
// 34. 在排序数组中查找元素的第一个和最后一个位置
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
//
//如果数组中不存在目标值 target，返回 [-1, -1]。
//
//进阶：
//
//你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
//
//
//示例 1：
//
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4]
//示例 2：
//
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1]
//示例 3：
//
//输入：nums = [], target = 0
//输出：[-1,-1]
//
//
//提示：
//
//0 <= nums.length <= 105
//-109 <= nums[i] <= 109
//nums 是一个非递减数组
//-109 <= target <= 109
func searchRange(nums []int, target int) []int {
	return []int{findLeftBound(nums, target), findRightBound(nums, target)}
}

func findRightBound(nums []int, target int) int {
	l, r, mid := 0, len(nums)-1, 0
	for l <= r {
		mid = l + ((r - l) >> 1)
		// 右边界
		if target >= nums[mid] {
			l = mid + 1
		} else {
			r = mid - 1
		}
	}
	if r >= 0 && target == nums[r] {
		return r
	}
	return -1
}

func findLeftBound(nums []int, target int) int {
	l, r, mid := 0, len(nums)-1, 0
	for l <= r {
		mid = l + ((r - l) >> 1)
		// 右边界
		if target <= nums[mid] {
			r = mid - 1
		} else {
			l = mid + 1
		}
	}
	if l < len(nums) &&target == nums[l] {
		return l
	}
	return -1
}
