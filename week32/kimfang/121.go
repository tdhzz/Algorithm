package kimfang
func maxProfit(prices []int) int {
	if len(prices) == 0 {
		return 0
	}
	var ans int
	preMin := prices[0]
	for i:=1; i < len(prices); i++ {
		if prices[i] <= preMin {
			preMin = prices[i]
		}else{
			ans = max(ans, prices[i]-preMin)
		}
	}
	return ans
}

func max(a, b int ) int {
	if a > b {
		return a
	}
	return b
}