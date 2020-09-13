package week_02

//给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。
//
//(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
//
// 
//
//注意：
//
//你可以假设两个字符串均只含有小写字母。
//
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true

// 解法1: 借助map, 时间复杂度O(m+n), 空间复杂度O(n)
func canConstruct(ransomNote string, magazine string) bool {
	if len(ransomNote) > len(magazine) {
		return false
	}

	temMap := make(map[int32]uint32, len(magazine))
	for _, c1 := range magazine {
		if _, exist := temMap[c1]; !exist {
			temMap[c1] = 1
			continue
		}
		temMap[c1]++
	}

	for _, c2 := range ransomNote {
		if num, exist := temMap[c2]; !exist || num <= 0 {
			return false
		}
		temMap[c2]--
	}
	return true
}

// 解法2:
