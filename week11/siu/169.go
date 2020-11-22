package main

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//
// 示例 1:
//
// 输入: [3,2,3]
//输出: 3
//
// 示例 2:
//
// 输入: [2,2,1,1,1,2,2]
//输出: 2
//
// Related Topics 位运算 数组 分治算法
// 👍 799 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
// 摩尔投票法（Boyer–Moore majority vote algorithm），也被称作「多数投票法」，算法解决的问题是：如何在任意多的候选人中（选票无序），选出获得票数最多的那个。
//
// 算法可以分为两个阶段：
//
// 对抗阶段：分属两个候选人的票数进行两两对抗抵消
// 计数阶段：计算对抗结果中最后留下的候选人票数是否有效
func majorityElement(nums []int) int {
	var major int
	count := 0
	for _, num := range nums {
		if count == 0 {
			major = num
		}
		if major == num {
			count++
		} else {
			count--
		}
	}
	return major
}

//leetcode submit region end(Prohibit modification and deletion)
