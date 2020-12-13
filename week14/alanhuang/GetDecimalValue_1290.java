/**
 * @Classname GetDecimalValue_1290
 * @Description 1290. 二进制链表转整数
 * @Date 2020/12/13 17:06
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GetDecimalValue_1290 {
	public int getDecimalValue(ListNode head) {
		int res = 0;
		while (head != null) {
			res = res * 2 + head.val;
			head = head.next;
		}
		return res;

	}
}
