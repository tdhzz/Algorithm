/*
898. 子数组按位或操作
我们有一个非负整数数组 A。

对于每个（连续的）子数组 B = [A[i], A[i+1], ..., A[j]] （ i <= j），我们对 B 中的每个元素进行按位或操作，获得结果 A[i] | A[i+1] | ... | A[j]。

返回可能结果的数量。 （多次出现的结果在最终答案中仅计算一次。）

 

示例 1：

输入：[0]
输出：1
解释：
只有一个可能的结果 0 。
示例 2：

输入：[1,1,2]
输出：3
解释：
可能的子数组为 [1]，[1]，[2]，[1, 1]，[1, 2]，[1, 1, 2]。
产生的结果为 1，1，2，1，3，3 。
有三个唯一值，所以答案是 3 。
示例 3：

输入：[1,2,4]
输出：6
解释：
可能的结果是 1，2，3，4，6，以及 7 。
*/
/**
 * @param {number[]} A
 * @return {number}
 */
var subarrayBitwiseORs = function(A) {
    let ans =new Set();
    let cur = new Set();
    for(let i=0;i<A.length;i++){
        let tempCur = new Set();
        cur.forEach(v => {
            tempCur.add(v|A[i]);
        })
        tempCur.add(A[i]);
        cur = tempCur;
        cur.forEach(v => {
            ans.add(v);
        });
    }
    return ans.size;
};