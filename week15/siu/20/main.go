package main

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
// Related Topics 栈 字符串
// 👍 2048 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
func isValid(s string) bool {
	stack := make([]byte, 0)
	top := 0
	for _, b := range s {
		switch {
		case b == '{':
			stack = append(stack, '}')
			top++
		case b == '[':
			stack = append(stack, ']')
			top++
		case b == '(':
			stack = append(stack, ')')
			top++
		default:
			if top > 0 && byte(b) == stack[top-1] {
				stack = stack[:top-1]
				top--
			} else {
				return false
			}
		}
	}
	if len(stack) != 0 {
		return false
	}
	return true
}

//leetcode submit region end(Prohibit modification and deletion)
