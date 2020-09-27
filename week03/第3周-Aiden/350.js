/*
350. 两个数组的交集 II
给定两个数组，编写一个函数来计算它们的交集。

 

示例 1：

输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2,2]
示例 2:

输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出：[4,9]
 

说明：

输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
我们可以不考虑输出结果的顺序。
*/

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    const map = {},res = [];
    for (const num1 of nums1) { 
        if (map[num1]) map[num1]++;  
        else map[num1] = 1; 
    }
    for (const num2 of nums2) { 
        const val = map[num2];
        if (val > 0) {            
            res.push(num2);         
            map[num2]--;            
        }
    }
    return res;
};