package kimfang

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//注意：给定 n 是一个正整数。
//
//示例 1：
//输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶

//示例 2：
//输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶

// 一般解法: O(n)空间复杂度, 时间复杂度O(n)
func climbStairs(n int) int {
	if n <= 2 {
		return n
	}
	// 设爬到n阶有dp[n]种方法
	// dp[n] = dp[n-1] + dp[n-2]
	dp := make([]int, 0, n+1)
	dp[1] = 1
	dp[2] = 2
	for i := 3; i <= n; i++ {
		dp[i] = dp[i-1] + dp[i-2]
	}
	return dp[n]
}

// 节约空间: O(1)空间复杂度, 时间复杂度O(n)
func climbStairs2(n int) int {
	dp := n
	one, two := 1, 2
	for i := 3; i <= n; i++ {
		dp = one + two
		one, two = two, dp
	}
	return dp
}
