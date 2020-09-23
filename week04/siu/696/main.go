package main

func main() {
	println(countBinarySubstrings("11001010"))
}

func countBinarySubstrings(s string) int {
	// 下标
	index := 0
	// 长度
	size := len(s)
	// 上一个连续字符的长度
	last := 0
	// 总个数
	count := 0

	for index < size {
		// 当前字符
		thisRune := s[index]
		// 初始化当前连续字符的长度
		this := 0

		// 计算当前字符的连续长度
		for index < size && s[index] == thisRune {
			index++
			this++
		}

		count += min(this, last)
		last = this
	}

	return count
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
