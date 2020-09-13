package week_02

import "math"

// 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
//
//你可以按任意顺序返回答案。
//
// 
//
//示例 1：
//
//输入：["bella","label","roller"]
//输出：["e","l","l"]
//示例 2：
//
//输入：["cool","lock","cook"]
//输出：["c","o"]
// 
//
//提示：
//
//1 <= A.length <= 100
//1 <= A[i].length <= 100
//A[i][j] 是小写字母

func commonChars(A []string) []string {
	pre := make(map[int32]int)
	for k, v := range A {
		temp := make(map[int32]int)
		for _, v1 := range v {
			temp[v1]++
		}
		if k == 0 {
			pre = temp
		} else {
			for k := range temp {
				if pre[k] != 0 {
					temp[k] = int(math.Min(float64(temp[k]), float64(pre[k])))
				} else {
					delete(temp, k)
				}
			}
			pre = temp
		}
	}
	var result []string
	for k, v := range pre {
		for i := 1; i <= v; i++ {
			result = append(result, string(k))
		}
	}
	return result
}