package kimfang
//705. 设计哈希集合
//不使用任何内建的哈希表库设计一个哈希集合
//
//具体地说，你的设计应该包含以下的功能
//
//add(value)：向哈希集合中插入一个值。
//contains(value) ：返回哈希集合中是否存在这个值。
//remove(value)：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
//
//示例:
//
//MyHashSet hashSet = new MyHashSet();
//hashSet.add(1);
//hashSet.add(2);
//hashSet.contains(1);    // 返回 true
//hashSet.contains(3);    // 返回 false (未找到)
//hashSet.add(2);
//hashSet.contains(2);    // 返回 true
//hashSet.remove(2);
//hashSet.contains(2);    // 返回  false (已经被删除)
//
//注意：
//
//所有的值都在 [0, 1000000]的范围内。
//操作的总数目在[1, 10000]范围内。
//不要使用内建的哈希集合库。
//通过次数22,952提交次数39,260
type MyHashSet struct {
	Bit []uint64
}


/** Initialize your data structure here. */
func Constructor() MyHashSet {
	return MyHashSet{Bit: make([]uint64, 1000000/4 +1)}
}


func (this *MyHashSet) Add(key int)  {
	this.Bit[key/64] |= this.convertToBit(key%64)
}


func (this *MyHashSet) Remove(key int)  {
	this.Bit[key/64] &= ^this.convertToBit(key%64)
}


/** Returns true if this set contains the specified element */
func (this *MyHashSet) Contains(key int) bool {
	mask := this.convertToBit(key%64)
	return (this.Bit[key/64] & mask) == mask
}

func (this *MyHashSet) convertToBit(shift int) uint64 {
	return uint64(1 << shift)
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Add(key);
 * obj.Remove(key);
 * param_3 := obj.Contains(key);
 */