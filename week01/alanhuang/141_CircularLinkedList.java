/**
 * @Classname CircularlinkedList
 * @Description TODO
 * @Date 2020/9/7 10:04
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CircularLinkedList {
	public class Solution {
		public boolean hasCycle(ListNode head) {
			if(head == null){
				return false;
			}
			ListNode slowNode = head;
			ListNode fastNode = head.next;
			while(fastNode !=null && fastNode.next !=null){
				if(slowNode.equals(fastNode)){
					return true;
				}

				slowNode = slowNode.next;
				fastNode = fastNode.next.next;
			}
			return false;
		}
	}
}
//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode(int x)
	{
		val = x;
		next = null;
	}
}
