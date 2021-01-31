/**
 * @Classname MyHashSet_705
 * @Description 705. 设计哈希集合
 * @Date 2021/1/31 14:43
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MyHashSet_705 {
	class Node{
		int val;
		Node prev, next;

		Node (int val) {
			this.val = val;
		}
	}

	private int length = 100;
	private Node[] data = new Node[length];

	/** Initialize your data structure here. */
	public MyHashSet_705() {

	}

	public void add(int key) {
		int index = key % length;
		Node curr = data[index];
		if (curr == null) {
			Node node = new Node(key);
			data[index] = node;
			return;
		}
		while(true) {
			if (curr.val == key) {
				return;
			}
			if(curr.next == null) {
				Node node = new Node(key);
				node.prev = curr;
				curr.next = node;
				return;
			} else {
				curr = curr.next;
			}
		}
	}

	public void remove(int key) {
		int index = key % length;
		Node curr = data[index];
		if (curr != null && curr.val == key) {
			Node next = curr.next;
			if (next != null) {
				next.prev = null;
			}
			data[index] = next;
			return;
		}
		while(curr != null) {
			if (curr.val == key) {
				Node next = curr.next;
				Node prev = curr.prev;
				if (next != null) {
					next.prev = prev;
				}
				if (prev != null) {
					prev.next = next;
				}
				return;
			}
			curr = curr.next;
		}
	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		int index = key % length;
		Node curr = data[index];
		while(curr != null) {
			if (curr.val == key) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
}
