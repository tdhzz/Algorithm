/*
1525. 字符串的好分割数目
给你一个字符串 s ，一个分割被称为 「好分割」 当它满足：将 s 分割成 2 个字符串 p 和 q ，它们连接起来等于 s 且 p 和 q 中不同字符的数目相同。

请你返回 s 中好分割的数目。

 

示例 1：

输入：s = "aacaba"
输出：2
解释：总共有 5 种分割字符串 "aacaba" 的方法，其中 2 种是好分割。
("a", "acaba") 左边字符串和右边字符串分别包含 1 个和 3 个不同的字符。
("aa", "caba") 左边字符串和右边字符串分别包含 1 个和 3 个不同的字符。
("aac", "aba") 左边字符串和右边字符串分别包含 2 个和 2 个不同的字符。这是一个好分割。
("aaca", "ba") 左边字符串和右边字符串分别包含 2 个和 2 个不同的字符。这是一个好分割。
("aacab", "a") 左边字符串和右边字符串分别包含 3 个和 1 个不同的字符。
示例 2：

输入：s = "abcd"
输出：1
解释：好分割为将字符串分割成 ("ab", "cd") 。
示例 3：

输入：s = "aaaaa"
输出：4
解释：所有分割都是好分割。
示例 4：

输入：s = "acbadbaada"
输出：2
 

提示：

s 只包含小写英文字母。
1 <= s.length <= 10^5
*/


/**
 * @param {string} s
 * @return {number}
 */
var numSplits = function(s) {
    let len = s.length;
    if(len<2) return 0;
    let left = [],right = [],setL = new Set(),setR = new Set(),result = 0;
    for(let i=0;i<len;i++){
        let l = s.charAt(i);       //从第一个字符开始，到最后一个字符
        let r = s.charAt(len-i-1); //从最后一个字符开始，到第一个字符
        setL.add(l);setR.add(r);
        left[i]=setL.size;        //left[i]：左边不同字符的个数（包含自己）
        right[len-i-1]=setR.size; //right[i]：右边不同字符的个数(包含自己)
    }
    for(let i=0;i<len-1;i++){
        if(left[i]==right[i+1]){    //字符左边不同字符的个数（包含自己）与 右边不同字符的个数(不包含自己)
            result++;
        }
    }
    return result;
};




