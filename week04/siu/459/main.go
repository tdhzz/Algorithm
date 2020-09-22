package main

import "strings"

func main() {
	println(repeatedSubstringPattern("aaaa"))
}

func repeatedSubstringPattern(s string) bool {
	if len(s) == 0 {
		return false
	}

	doubleS := s + s
	return strings.Index(doubleS[1:len(doubleS)-1], s) >= 0
}
