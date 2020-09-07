package siu

type ListNode struct {
	Val  int
	Next *ListNode
}

func hasCycle(head *ListNode) bool {
	var slow, fast *ListNode
	slow = head
	fast = head

	for fast != nil && fast.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next

		if fast == slow {
			return true
		}

	}
	return false
}
