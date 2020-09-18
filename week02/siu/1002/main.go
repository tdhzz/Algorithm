package main

import "strings"

func commonChars(A []string) []string {

	strCount := make(map[string]int)
	for _, v := range A[0] {
		strCount[string(v)]++
	}

	for i := 1; i < len(A); i++ {
		for k, v := range strCount {
			if strings.Count(A[i], k) <= v {
				strCount[k] = strings.Count(A[i], k)
			}
		}
	}

	var res []string
	for k, v := range strCount {
		for i := 1; i <= v; i++ {
			res = append(res, k)
		}
	}

	return res
}
