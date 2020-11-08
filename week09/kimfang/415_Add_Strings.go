package week_09

import "strconv"

//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
//
// 
//
//提示：
//
//num1 和num2 的长度都小于 5100
//num1 和num2 都只包含数字 0-9
//num1 和num2 都不包含任何前导零
//你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式

func addStrings(num1 string, num2 string) string {
	ret := ""
	var n1, n2, sum int
	var carry int
	var zero byte = '0'
	for i, j := len(num1)-1, len(num2)-1; i > 0 || j > 0; i, j = i-1, j-1 {
		if i > 0 {
			n1 = int(num1[i] - zero)
		}
		if j > 0 {
			n2 = int(num2[j] - zero)
		}
		sum = n1 + n2 + carry
		ret = strconv.Itoa(sum%10) + ret
		carry = sum / 10
	}
	return ret
}
