package siu

func isSubsequence(s string, t string) bool {
	var sk, tk, sl, tl int
	sl = len(s)
	tl = len(t)

	// 方法：双指针
	// 遍历t字符串，当t当前字符与s当前字符匹配，则s当前位置+1
	// 当遍历结束：匹配完s所有字符 或 遍历完t所有字符
	// 结果：判断s当前位置是否与s长度相等
	for sk < sl && tk < tl {
		if t[tk] == s[sk] {
			sk++
		}
		tk++
	}

	return sl == sk
}
