package main

type ListNode struct {
	Val  int
	Next *ListNode
}

func main() {

}

func deleteNode(node *ListNode) {
	*node = *node.Next
}
