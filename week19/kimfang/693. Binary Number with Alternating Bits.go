package kimfang
func hasAlternatingBits(n int) bool {
	tmp := n^(n>>1)
	return tmp&(tmp+1)==0
}