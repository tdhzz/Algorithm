/*342. 4的幂
给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。

示例 1:

输入: 16
输出: true
示例 2:

输入: 5
输出: false*/

/**
 * @param {number} num
 * @return {boolean}
 */
var isPowerOfFour = function(num) {
    // 方法一
    // return (num > 0) && (Math.log(num) / Math.log(2) % 2 == 0);

    // 方法二
    while (num>1) num=num/4
    return num==1

    // 方法三
    // if(num<1) return false;
    // if(num==1) return true;
    // if(num%4!=0) return false;
    // return isPowerOfFour(num/4);
};