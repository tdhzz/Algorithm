/**
 * @Classname DeleteNode_237
 * @Description 删除链表中的节点
 * @Date 2020/9/26 16:39
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DeleteNode_237 {
	public void deleteNode(ListNode node) {
		if(node==null){
			return;
		}
		node.val=node.next.val;
		node.next=node.next.next;
	}
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
