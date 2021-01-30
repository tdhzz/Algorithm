package kimfang

import "strconv"

func getFolderNames(names []string) []string {
	d, ans := map[string]int{}, []string{}
	for _, name := range names {
		s := name
		for d[s] > 0 {
			s = name + "(" + strconv.Itoa(d[name]) +")"
			d[name]++
		}
		d[s] = 1
		ans = append(ans, s)
	}
	return ans
}