package com.hck.leetcode.easy;

import java.util.*;

public class Week22 {


   int[] a;
    /*
    *//** Initialize your data structure here. *//*
    public MyHashMap() {
        a = new int[1000001];
        for(int i = 0;i < a.length;i++){
            a[i] = -1;
        }
    }
*/
    /** value will always be non-negative. */
    public void put(int key, int value) {
        a[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return a[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        a[key]  = -1;
    }


    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
        for (int x : arr) {
            occur.put(x, occur.getOrDefault(x, 0) + 1);
        }
        Set<Integer> times = new HashSet<Integer>();
        for (Map.Entry<Integer, Integer> x : occur.entrySet()) {
            times.add(x.getValue());
        }
        return times.size() == occur.size();
    }


    public int maxNumberOfBalloons(String text) {
        int[] letters = new int[26];
        for(char ch :text.toCharArray()){
            letters[ch - 97] ++;
        }
        letters['l' - 97] /= 2;
        letters['o' - 97] /= 2;
        int min = Integer.MAX_VALUE;
        for(char ch : "balon".toCharArray()){
            if(letters[ch - 97] < min){
                min = letters[ch - 97];
            }
        }
        return min;
    }

    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] ans = new int[length];
        int[] next = new int[101];
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int i = length - 1; i >= 0; --i) {
            int warmerIndex = Integer.MAX_VALUE;
            for (int t = T[i] + 1; t <= 100; ++t) {
                if (next[t] < warmerIndex) {
                    warmerIndex = next[t];
                }
            }
            if (warmerIndex < Integer.MAX_VALUE) {
                ans[i] = warmerIndex - i;
            }
            next[T[i]] = i;
        }
        return ans;
    }


}
