package kimfang

//给定一个链表，判断链表中是否有环。
//为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
//示例 1：

//输入：head = [3,2,0,-4], pos = 1
//输出：true
//解释：链表中有一个环，其尾部连接到第二个节点。

//示例 2：

//输入：head = [1,2], pos = 0
//输出：true
//解释：链表中有一个环，其尾部连接到第一个节点。

//示例 3：

//输入：head = [1], pos = -1
//输出：false
//解释：链表中没有环。
//
//进阶：
//你能用 O(1)（即，常量）内存解决此问题吗？

type ListNode struct {
	Val  int
	Next *ListNode
}
// 双指针: 时间复杂度O(n),空间复杂度O(1)
func hasCycle(head *ListNode) bool {
	if head == nil || head.Next == nil {
		return false
	}

	slow, fast := head, head.Next
	for {
		if slow == fast {
			return true
		}
		if fast.Next == nil || fast.Next.Next == nil {
			break
		}
		slow = slow.Next
		fast = fast.Next.Next
	}
	return false
}
