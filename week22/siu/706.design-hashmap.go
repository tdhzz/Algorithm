package main

//不使用任何内建的哈希表库设计一个哈希映射
//
// 具体地说，你的设计应该包含以下的功能
//
//
// put(key, value)：向哈希映射中插入(键,值)的数值对。如果键对应的值已经存在，更新这个值。
// get(key)：返回给定的键所对应的值，如果映射中不包含这个键，返回-1。
// remove(key)：如果映射中存在这个键，删除这个数值对。
//
//
//
//示例：
//
// MyHashMap hashMap = new MyHashMap();
//hashMap.put(1, 1);
//hashMap.put(2, 2);
//hashMap.get(1);            // 返回 1
//hashMap.get(3);            // 返回 -1 (未找到)
//hashMap.put(2, 1);         // 更新已有的值
//hashMap.get(2);            // 返回 1
//hashMap.remove(2);         // 删除键为2的数据
//hashMap.get(2);            // 返回 -1 (未找到)
//
//
//
//注意：
//
//
// 所有的值都在 [0, 1000000]的范围内。
// 操作的总数目在[1, 10000]范围内。
// 不要使用内建的哈希库。
//
// Related Topics 设计 哈希表
// 👍 121 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
type MyHashMap struct {
	hash [1002]List
}
type List struct {
	list []Node
}
type Node struct {
	key   int
	value int
}

/** Initialize your data structure here. */
func Constructor() MyHashMap {
	return MyHashMap{
		hash: [1002]List{},
	}
}

/** value will always be non-negative. */
func (this *MyHashMap) Put(key int, value int) {
	lindex := key % 1001
	for i := 0; i < len(this.hash[lindex].list); i++ {
		if this.hash[lindex].list[i].key == key {
			this.hash[lindex].list[i].value = value
			return
		}
	}
	this.hash[lindex].list = append(this.hash[lindex].list, Node{key: key, value: value})
}

/** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
func (this *MyHashMap) Get(key int) int {
	lindex := key % 1001
	for i := 0; i < len(this.hash[lindex].list); i++ {
		if this.hash[lindex].list[i].key == key {
			return this.hash[lindex].list[i].value
		}
	}
	return -1
}

/** Removes the mapping of the specified value key if this map contains a mapping for the key */
func (this *MyHashMap) Remove(key int) {
	lindex := key % 1001
	for i := 0; i < len(this.hash[lindex].list); i++ {
		if this.hash[lindex].list[i].key == key {
			this.hash[lindex].list = append(this.hash[lindex].list[:i], this.hash[lindex].list[i+1:]...)
		}
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Put(key,value);
 * param_2 := obj.Get(key);
 * obj.Remove(key);
 */
//leetcode submit region end(Prohibit modification and deletion)
