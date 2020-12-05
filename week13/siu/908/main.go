package main

// ∵ 让 max - min 最小
// ∴ max 要最小，即 max - k
//   min 要最大，即 min + k
// ∴ max - min 最小的情况，即 (max - k) - (min + k)

func smallestRangeI(A []int, K int) int {
	minA, maxA := A[0], A[0]
	for _, v := range A {
		minA = min(minA, v)
		maxA = max(maxA, v)
	}
	return max(0, maxA-minA-2*K)
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
