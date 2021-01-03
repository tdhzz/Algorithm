package main

import "unicode"

//给定一个字符串牌照 licensePlate 和一个字符串数组 words ，请你找出并返回 words 中的 最短补全词 。
//
// 如果单词列表（words）中的一个单词包含牌照（licensePlate）中所有的字母，那么我们称之为 补全词 。在所有完整词中，最短的单词我们称之为 最
//短补全词 。
//
// 单词在匹配牌照中的字母时要：
//
//
// 忽略牌照中的数字和空格。
// 不区分大小写，比如牌照中的 "P" 依然可以匹配单词中的 "p" 字母。
// 如果某个字母在牌照中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
//
//
// 例如：licensePlate = "aBc 12c"，那么它由字母 'a'、'b' （忽略大写）和两个 'c' 。可能的 补全词 是 "abccdef"
//、"caaacab" 以及 "cbca" 。
//
// 题目数据保证一定存在一个最短补全词。当有多个单词都符合最短补全词的匹配条件时取单词列表中最靠前的一个。
//
//
//
// 示例 1：
//
// 输入：licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
//输出："steps"
//说明：最短补全词应该包括 "s"、"p"、"s" 以及 "t"。在匹配过程中我们忽略牌照中的大小写。
//"step" 包含 "t"、"p"，但只包含一个 "s"，所以它不符合条件。
//"steps" 包含 "t"、"p" 和两个 "s"。
//"stripe" 缺一个 "s"。
//"stepple" 缺一个 "s"。
//因此，"steps" 是唯一一个包含所有字母的单词，也是本样例的答案。
//
// 示例 2：
//
// 输入：licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
//输出："pest"
//说明：存在 3 个包含字母 "s" 且有着最短长度的补全词，"pest"、"stew"、和 "show" 三者长度相同，但我们返回最先出现的补全词 "pes
//t" 。
//
//
// 示例 3：
//
// 输入：licensePlate = "Ah71752", words = ["suggest","letter","of","husband","easy
//","education","drug","prevent","writer","old"]
//输出："husband"
//
//
// 示例 4：
//
// 输入：licensePlate = "OgEu755", words = ["enough","these","play","wide","wonder"
//,"box","arrive","money","tax","thus"]
//输出："enough"
//
//
// 示例 5：
//
// 输入：licensePlate = "iMSlpe4", words = ["claim","consumer","student","camera","
//public","never","wonder","simple","thought","use"]
//输出："simple"
//
//
//
//
// 提示：
//
//
// 1 <= licensePlate.length <= 7
// licensePlate 由数字、大小写字母或空格 ' ' 组成
// 1 <= words.length <= 1000
// 1 <= words[i].length <= 15
// words[i] 由小写英文字母组成
//
// Related Topics 哈希表
// 👍 36 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
func shortestCompletingWord(licensePlate string, words []string) string {
	lengthWords := len(words)
	min := 16
	minWord := ""

	//依次遍历取出words里的每个单词
	for i := 0; i < lengthWords; i++ {
		wordLength := len(words[i])
		list := make([]int, 26)
		//如果该单词比当前最短完整词的长度长则舍去
		if wordLength < min {
			//依次将每个单词转换到长度为26的哈希表里(切片做哈希表)
			for j := 0; j < wordLength; j++ {
				list[words[i][j]-'a']++
			}
			//依次遍历比较牌照中的字母是否都在该单词里
			if compare(list, licensePlate) {
				//如果存在则更新最短完整词和最短长度
				min = wordLength
				minWord = words[i]
			}
		}
	}
	return minWord
}

func compare(list []int, licensePlate string) bool {
	for i := 0; i < len(licensePlate); i++ {
		if letter := licensePlate[i]; unicode.IsLetter(rune(letter)) {
			if list[(letter|32)-'a'] <= 0 {
				return false
			}
			list[(letter|32)-'a']--
		}
	}
	return true
}

//leetcode submit region end(Prohibit modification and deletion)
