package main

import "fmt"

//169. 多数元素
//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//
//你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//
//示例 1:
//
//输入: [3,2,3]
//输出: 3
//示例 2:
//
//输入: [2,2,1,1,1,2,2]
//输出: 2

func main() {
	fmt.Println(majorityElement([]int{3, 2, 3}))
}

// 1. 排序
// 2. 借助map
func majorityElement(nums []int) int {
	if len(nums) == 0 {
		return 0
	}
	cur, occur := 0, 0
	for _, num := range nums {
		if cur == num {
			occur++
			continue
		}
		occur--
		if occur <= 0 {
			cur = num
			occur = 1
		}
	}
	return cur
}
