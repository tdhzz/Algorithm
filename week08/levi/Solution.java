package com.hck.leetcode.easy;

import java.util.*;

public class Week08 {

    public static void main(String[] args) {
       System.out.println(addBinary("1010","1011"));
    }


    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i <= 100; i++) {
            Double first = Math.pow(x, i);
            if (first >= bound) {
                break;
            }
            for (int j = 0; j <= 100; j++) {
                Double num = first + Math.pow(y, j);
                if (num <= bound) {
                    result.add(num.intValue());
                } else {
                    break;
                }
            }
        }
        return new ArrayList<>(result);
    }


    public int[] sumZero(int n) {
        int a[] = new int[n];
        int i = n / 2;
        if (n % 2 == 1) {
            a[0] = 0;
            for (int j = 1; j <= i; j++) {
                a[j * 2 - 1] = 0 - j;
                a[j * 2] = j;
            }
        } else {
            for (int j = 1; j <= i; j++) {
                a[(j - 1) * 2] = 0 - j;
                a[j * 2 - 1] = j;
            }
        }
        return a;
    }

    public boolean isMonotonic(int[] A) {
        int length = A.length;
        boolean b = A[0] <= A[length - 1];
        for (int i = 0; i < length - 1; i++) {
            if (b) {
                if (A[i] > A[i + 1]) {
                    return false;
                }
            } else {
                if (A[i] < A[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static String addBinary(String a, String b) {
        //StringBuilder result = new StringBuilder((Long.valueOf(a) + Long.valueOf(b)) + "");
        String max = a.length()>b.length()?a:b;
        String min = a.length()>b.length()?b:a;
        int minLength = min.length()-1;
        StringBuilder result = new StringBuilder();
        int j = 0;
        for(int i=max.length()-1;i>=0;i--){
            Integer num = Integer.parseInt(max.charAt(i)+"");
            if(minLength>=j){
                num+=Integer.parseInt(min.charAt(minLength-j)+"");
                j++;
            }
            result.insert(0,num);
        }
        StringBuffer sb = new StringBuffer();
        int length = result.length();
        for (int i = length -1; i >= 0; i--) {
            int num = Integer.parseInt(result.charAt(i) + "");
            if (num % 2 == 1) {
                sb.insert(0,1);
            } else {
                sb.insert(0,0);
            }
            int up = num / 2;
            if (up > 0) {
                //进位
                if (i != 0) {
                    result.replace(  i-1, i , (Integer.parseInt(result.charAt(i - 1) + "") + up) + "");
                } else {
                    result.replace(0,1,up+"");
                    i++;
                }
            }
        }
        return sb.toString();
    }

}
