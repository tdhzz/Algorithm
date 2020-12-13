package main

import "sort"

//集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重
//复。
//
// 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
//
// 示例 1:
//
//
//输入: nums = [1,2,2,4]
//输出: [2,3]
//
//
// 注意:
//
//
// 给定数组的长度范围是 [2, 10000]。
// 给定的数组是无序的。
//
// Related Topics 哈希表 数学
// 👍 137 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
func findErrorNums(nums []int) []int {
	sameNum := 0
	temp := 0
	sum := 0
	sort.Sort(sort.IntSlice(nums))
	for _, value := range nums {
		if temp == 0 {
			temp = value
		} else {
			if temp == value {
				sameNum = value
			}
			temp = value
		}
		sum += value
	}
	return []int{sameNum, ((1 + len(nums)) * len(nums) / 2) - (sum - sameNum)}
}

//leetcode submit region end(Prohibit modification and deletion)
