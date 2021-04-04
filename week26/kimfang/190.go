package kimfang

func reverseBits(num uint32) uint32 {
	var ret uint32
	for i := 0; i < 32; i++ {
		// 获取低位数
		tmp := num & 1
		// 追加到结果的高位,并且右移
		ret |= tmp
		if i < 31 {
			ret <<= 1
		}
		// 原数组右移
		num >>= 1
	}
	return ret
}


