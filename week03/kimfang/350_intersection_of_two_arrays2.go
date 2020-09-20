package kimfang

// 给定两个数组，编写一个函数来计算它们的交集。
//
// 
//
//示例 1：
//
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
//示例 2:
//
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9]
// 
//
//说明：
//
//输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
//我们可以不考虑输出结果的顺序。
//进阶：
//
//如果给定的数组已经排好序呢？你将如何优化你的算法？
//如果 nums1 的大小比 nums2 小很多，哪种方法更优？
//如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？

// 方法一: 借助HashMap
func intersect(nums1 []int, nums2 []int) []int {
	if len(nums1) == 0 || len(nums2) == 0 {
		return make([]int, 0)
	}
	ans := make([]int, 0)
	// 借助map
	tmpMap := make(map[int]int, len(nums1))
	for _, n1 := range nums1 {
		if num, exist := tmpMap[n1]; exist {
			tmpMap[n1] = num + 1
			continue
		}
		tmpMap[n1] = 1
	}
	// 找交集
	for _, n2 := range nums2 {
		if num, exist := tmpMap[n2]; exist && num > 0 {
			ans = append(ans, n2)
			tmpMap[n2] = num - 1
		}
	}

	return ans
}

// 进阶一: 如果给定的数组已经排好序呢？你将如何优化你的算法？（双指针）
func intersect1(nums1 []int, nums2 []int) []int {
	if len(nums1) == 0 || len(nums2) == 0 {
		return make([]int, 0)
	}
	ans := make([]int, 0)
	// 两个指针都没到尾
	for p1, p2 := len(nums1), len(nums2); p1 < len(nums1) && p2 < len(nums2); {
		if nums1[p1] < nums2[p2] {
			p1++
			continue
		}
		if nums1[p1] > nums2[p2] {
			p2++
			continue
		}
		ans = append(ans, nums2[p2])
		p1++
		p2++
	}
	return ans
}