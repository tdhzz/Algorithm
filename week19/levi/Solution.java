package com.hck.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Week20 {

    public static void main(String[] args) {

    }


    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }


    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }


    public int xorOperation(int n, int start) {
        int res= 0;
        for(int i=0;i<n;i++){
            res = res^(start+2*i);
        }
        return res;
    }



    public List<String> readBinaryWatch(int num) {
        List<String> ret = new ArrayList<>();
        for(int i = 0;i<=11;i++){
            for(int j = 0;j<=59;j++){

                if(Integer.bitCount(i)+Integer.bitCount(j)==num){
                    ret.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return ret;
    }


    public int findMaximumXOR(int[] nums) {
        int max=0;
        for(int n:nums){
            max=Math.max(max,n);
        }
        int len=Integer.toBinaryString(max).length();
        int res=0;
        int mask=0;
        for(int i=len-1;i>=0;i--){
            mask=res | 1<<i;//目前位的值为1的mask
            Set<Integer> set=new HashSet<Integer>();
            for(int n:nums){
                set.add(n&mask);//仅保留数的最高k位
            }
            for(int n:set){
                if(set.contains(mask^n)){
                    res=res | 1<<i;
                }
            }
        }
        return res;
    }
}
