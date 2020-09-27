package main

import "fmt"

func main() {
	fmt.Println(numSplits("acbadbaada"))
}

func numSplits(s string) int {
	left := make(map[rune]int)
	right := make(map[rune]int)
	for _, r := range s {
		right[r]++
	}

	count := 0
	for _, r := range s {
		left[r]++
		right[r]--
		if right[r] == 0 {
			delete(right, r)
		}
		if len(left) == len(right) {
			count++
		}
	}
	return count
}
