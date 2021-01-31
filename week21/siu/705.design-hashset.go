package main

import "fmt"

//不使用任何内建的哈希表库设计一个哈希集合
//
// 具体地说，你的设计应该包含以下的功能
//
//
// add(value)：向哈希集合中插入一个值。
// contains(value) ：返回哈希集合中是否存在这个值。
// remove(value)：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
//
//
//
//示例:
//
// MyHashSet hashSet = new MyHashSet();
//hashSet.add(1);
//hashSet.add(2);
//hashSet.contains(1);    // 返回 true
//hashSet.contains(3);    // 返回 false (未找到)
//hashSet.add(2);
//hashSet.contains(2);    // 返回 true
//hashSet.remove(2);
//hashSet.contains(2);    // 返回  false (已经被删除)
//
//
//
//注意：
//
//
// 所有的值都在 [0, 1000000]的范围内。
// 操作的总数目在[1, 10000]范围内。
// 不要使用内建的哈希集合库。
//
// Related Topics 设计 哈希表
// 👍 81 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
type MyHashSet struct {
	bucket int
	bitSet []uint64
}

/** Initialize your data structure here. */
func Constructor() MyHashSet {
	return MyHashSet{
		bitSet: make([]uint64, (1000000/64)+1),
		bucket: 64,
	}
}

func (this *MyHashSet) Add(key int) {
	bit, length := this.getBitAndLength(key)
	this.bitSet[length] |= 1 << bit
}

func (this *MyHashSet) Remove(key int) {
	bit, length := this.getBitAndLength(key)
	this.bitSet[length] &= ^(1 << bit)
}

/** Returns true if this set contains the specified element */
func (this *MyHashSet) Contains(key int) bool {
	bit, length := this.getBitAndLength(key)
	return this.bitSet[length]&(1<<bit) != 0
}

func (this *MyHashSet) getBitAndLength(key int) (int, int) {
	bit := key % this.bucket
	length := key / this.bucket
	return bit, length
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Add(key);
 * obj.Remove(key);
 * param_3 := obj.Contains(key);
 */
//leetcode submit region end(Prohibit modification and deletion)

func main() {
	obj := Constructor()
	key := 1000000
	obj.Add(key)
	obj.Remove(key)
	param_3 := obj.Contains(key)
	fmt.Println(param_3)
}
