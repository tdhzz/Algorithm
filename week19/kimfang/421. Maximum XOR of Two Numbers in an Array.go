package kimfang
func findMaximumXOR(nums []int) int {
	res := 0
	mask := 0
	for i := 31; i >= 0; i-- {
		mask = mask | (1 << i)
		s := make(map[int]bool)
		for _, num := range nums {
			s[num&mask] = true
		}
		tmp := (1 << i) | res
		for v := range s {
			if _, ok := s[tmp^v]; ok {
				res = tmp
				break
			}
		}
	}
	return res
}