/*
给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。

(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)

 

注意：

你可以假设两个字符串均只含有小写字母。

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    // if(ransomNote.length > magazine.length){
    //     return false;
    // }
    // if(!ransomNote){
    //     return true;
    // }
    // let index;
    // for(let i=0,len=ransomNote.length;i<len;i++){
    //    //包含这个字符
    //    if(magazine.indexOf(ransomNote[i])>-1){
    //        index = magazine.indexOf(ransomNote[i]);
    //        magazine = magazine.slice(0,index) +  magazine.slice(index+1,magazine.length);
    //    }else{
    //        return false;
    //    }
    // }
    // return true;

    //方法二
    let x;
    magazine=magazine.split("")
    for(var i=0;i<ransomNote.length;i++){
        if( (x=magazine.indexOf(ransomNote[i])) > -1){
            //赋值比删除更快
            //magazine.splice(x,1)
             magazine[x]=0
        }else{
            return false;
        }
    }
    return true;
};