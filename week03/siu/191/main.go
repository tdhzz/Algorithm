package main

func main() {
	println(hammingweightV1(00000000000000000000000000001011))
	println(hammingweightV2(00000000000000000000000000001011))
}

func hammingweightV1(num uint32) int {
	count := 0
	for num > 0 {
		// ∵ 从二进制的角度讲，num 相当于在 num - 1 的最低位加上 1
		// ∵ & 操作符：两个位都为1时，结果才为1
		num &= num - 1
		count++
	}
	return count
}

func hammingweightV2(num uint32) int {
	count := 0
	for num != 0 {
		if num&1 == 1 {
			count++
		}
		// 判断完后，右移一位，舍弃已经对比的值
		num >>= 1
	}
	return count
}
