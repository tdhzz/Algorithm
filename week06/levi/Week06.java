package com.hck.leetcode.easy;

public class Week06 {


    public int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        int q = -2;
        int o = -1;
        int tem = 2;
        for(int i =0; i<length;i++){
            if(A[i]%2==0){
                //偶数
                q+=tem;
                B[q] = A[i];
            }else{
                o+=tem;
                B[o] = A[i];
            }
        }
        return B;
    }
}
