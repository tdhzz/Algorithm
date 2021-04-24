package kimfang

import "sort"

func numSpecialEquivGroups(A []string) int {
	d := map[string]bool{}
	for _, a := range A {
		r := [2][]rune{}
		for i, c := range a {
			r[i & 1] = append(r[i & 1], c)
		}
		sort.Slice(r[0], func(i, j int) bool {return r[0][i] < r[0][j]})
		sort.Slice(r[1], func(i, j int) bool {return r[1][i] < r[1][j]})
		d[string(append(r[0], r[1]...))] = false
	}
	return len(d)
}