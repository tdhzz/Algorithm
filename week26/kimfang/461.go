package kimfang

func hammingDistance(x int, y int) int {
	ret := 0
	for i := 0; i < 32; i++ {
		if x&1 != y&1 {
			ret++
		}
		x >>= 1
		y >>= 1
	}
	return ret
}


