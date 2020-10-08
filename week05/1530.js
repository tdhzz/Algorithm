/*
1530. 好叶子节点对的数量
给你二叉树的根节点 root 和一个整数 distance 。

如果二叉树中两个 叶 节点之间的 最短路径长度 小于或者等于 distance ，那它们就可以构成一组 好叶子节点对 。

返回树中 好叶子节点对的数量 。

 

示例 1：

 



输入：root = [1,2,3,null,4], distance = 3
输出：1
解释：树的叶节点是 3 和 4 ，它们之间的最短路径的长度是 3 。这是唯一的好叶子节点对。
示例 2：



输入：root = [1,2,3,4,5,6,7], distance = 3
输出：2
解释：好叶子节点对为 [4,5] 和 [6,7] ，最短路径长度都是 2 。但是叶子节点对 [4,6] 不满足要求，因为它们之间的最短路径长度为 4 。
示例 3：

输入：root = [7,1,4,6,null,5,3,null,null,null,null,null,2], distance = 3
输出：1
解释：唯一的好叶子节点对是 [2,5] 。
示例 4：

输入：root = [100], distance = 1
输出：0
示例 5：

输入：root = [1,1,1], distance = 2
输出：1
 

*/

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} distance
 * @return {number}
 */
var countPairs = function(root, distance) {

    function dfs(node){
        if(node == null) return new Array(11).fill(0);
        // 当前节点为叶子节点
        if(node.left == node.right){
            let ret = new Array(11).fill(0);
            ret[1] = 1;
            return ret;
        }
        let left = dfs(node.left),
            right = dfs(node.right);
        // 计数
        for(let i = 0; i < 11; i++){
            for(j = distance - i; j >= 0; j--){
                res += left[i] * right[j];
            }
        }
        // 每向上一层距离加1，超过distance的节点抛弃。
        for(let i = 9; i >= 0; i--){
            left[i + 1] = right[i] + left[i];
        }
        return left;
    }
    let res = 0;
    dfs(root);
    return res;
};