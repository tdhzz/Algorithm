package kimfang

// 1. 排序
// 2. map
// 3. 异或
// 4. 累加相减
func findTheDifference(s string, t string) byte {
	var ret int32
	for i := 0; i < len(s); i++ {
		ret += int32(t[i] - s[i])
	}
	ret += int32(t[len(t)-1])
	return byte(ret)
}

