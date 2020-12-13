package com.hck.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Week14 {

    public static void main(String[] args) {
    }


    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int count = 1;
        int length = s.length();
        int j = 1;
        for (int i = 0; i < length - 1; i++) {
            if (s.charAt(i) == s.charAt(j)) {
                count++;
            } else {
                if (count > 2) {
                    List<Integer> list = new ArrayList<>();
                    list.add(j - count);
                    list.add(i);
                    res.add(list);
                }
                count = 1;
            }
            j++;
        }
        if (length > 1 && s.charAt(length - 1) == s.charAt(length - 2) && count > 2) {
            List<Integer> list = new ArrayList<>();
            list.add(length - count);
            list.add(length - 1);
            res.add(list);
        }
        return res;
    }


    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int count = list.size()-1;
        Double res = 0d;
        for(Integer num:list){
            count--;
            if(num!=0){
                res += Math.pow(2,count);
            }
        }
        return res.intValue();
    }


    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer num : nums){
            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;
    }


    public int removeDuplicates(int[] nums) {
        if(null == nums || nums.length==0) {
            return 0;
        }
        int index = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }


    public  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public int projectionArea(int[][] grid) {
        int N = grid.length;
        int ans = 0;

        for (int i = 0; i < N;  ++i) {
            int bestRow = 0, bestCol = 0;
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] > 0) ans++;
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }
        return ans;
    }

}
