package com.hck.leetcode.easy;

import java.util.*;

public class Week13 {

    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 1, 1};
        System.out.println(numIdenticalPairs(A));
    }


    public char nextGreatestLetter(char[] letters, char target) {
        int right = letters.length - 1;
        int left = 0;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (letters[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left < letters.length ? letters[left] : letters[0];
    }

    public int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int i = 0; i < A.length; i++) {
            int num = A[i];
            min = num < min ? num : min;
            max = num > max ? num : max;
        }
        return Math.max(0, max - min - 2 * K);
    }

    public static int pivotIndex(int[] nums) {
        int right = 0, left = 0, res = -1;
        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (left == right) {
                res = i;
                break;
            }
            left += nums[i];
        }
        return res;
    }

    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int add = map.get(num) + 1;
                map.put(num, add);
                res += add;
            } else {
                map.put(num, 0);
            }
        }
        return res;
    }

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        depth(root);
        return max;
    }

    public int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
