package kimfang
// 20. 有效的括号
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//有效字符串需满足：
//
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//注意空字符串可被认为是有效字符串。
//
//示例 1:
//
//输入: "()"
//输出: true
//示例 2:
//
//输入: "()[]{}"
//输出: true
//示例 3:
//
//输入: "(]"
//输出: false
//示例 4:
//
//输入: "([)]"
//输出: false
//示例 5:
//
//输入: "{[]}"
//输出: true

func isValid(s string) bool {
	bracketMap := map[byte]byte{')':'(', '}':'{', ']':'['}
	stack := make([]byte, 0)
	for i:=0; i <len(s); i++ {
		if isLeft(s[i]) {
			stack = append(stack, s[i])
			continue
		}
		// 根据右括号，获取左括号
		left := bracketMap[s[i]]
		// 判断栈顶元素是否匹配左括号
		if len(stack) > 0 && stack[len(stack)-1] == left{
			stack = stack[0:len(stack)-1]
			continue
		}
		return false
	}
	if len(stack) == 0 {
		return true
	}
	return false
}

func isLeft(bracket byte) bool {
	if bracket == '(' || bracket == '{' || bracket == '[' {
		return true
	}
	return false
}
