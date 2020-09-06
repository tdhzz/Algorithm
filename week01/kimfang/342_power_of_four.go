package kimfang

//给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
//
//示例 1:
//
//输入: 16
//输出: true
//示例 2:
//
//输入: 5
//输出: false
//进阶：
//你能不使用循环或者递归来完成本题吗？

// 循环解法: 时间复杂度O(n),空间复杂度:O(1)
func isPowerOfFour(num int) bool {
	for {
		if num|0 == 1 {
			return true
		}
		if num|0 == 0 {
			return false
		}
		num = num >> 2
	}
}

// 递归解法: 时间复杂度O(n),空间复杂度:O(1)
func isPowerOfFour2(num int) bool {
	if num < 1 {
		return false
	}
	if num == 1 {
		return true
	}
	if num%4 != 0 {
		return false
	}
	return isPowerOfFour2(num / 4)
}

func isPowerOfFour3(num int) bool {
	if num < 1 {
		return false
	}

	return num%3 == 1
}
