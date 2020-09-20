package week03

//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
//
//示例 1:
//
//输入: 1
//输出: true
//解释: 20 = 1
//示例 2:
//
//输入: 16
//输出: true
//解释: 24 = 16
//示例 3:
//
//输入: 218
//输出: false

// 方法一: 递归
func isPowerOfTwo(n int) bool {
	if n == 1 {
		return true
	}
	if n < 1 || n%2 != 0 {
		return false
	}
	return isPowerOfTwo(n / 2)
}

// 方法二: 数学法
func isPowerOfTwo2(n int) bool {
	if n > 0 && n&(n-1) == 0 {
		return true
	}
	return false
}
