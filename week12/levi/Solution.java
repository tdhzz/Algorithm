package com.leetCode.solution.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Week12 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        // 以升序数组的中间元素作为根节点 root。
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归的构建 root 的左子树与右子树。
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }

    public int[] runningSum(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int aLength = nums1.length;
        int bLength = nums2.length;
        int maxLength = Math.max(aLength, bLength);
        for (int i = 0; i < maxLength; i++) {
            if (i < aLength) {
                set1.add(nums1[i]);
            }
            if (i < bLength) {
                set2.add(nums2[i]);
            }
        }
        set1.retainAll(set2);
        int size = set1.size();
        int[] res = new int[size];
        int i = 0;
        for (Integer key : set1) {
            res[i] = key;
            i++;
        }
        return res;
    }

    public int[] mdays = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public int getDays(int year, int month, int day) {
        int days = year * 365;
        // 加闰年
        days += (year - 1) / 4; // 讲道理应该在+1，但是在下一步减去世纪年时会抵消，所以都不加了
        // 减世纪年
        days -= (year - 1) / 100; // 参考上一行代码的注释
        // 加400年
        days += (year - 1) / 400 + 1;
        // 加上当年天数
        days += mdays[month] + day;
        // 加上今年闰年影响
        if (year > 0 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
            if (month > 2)
                days++;
        return days;
    }

    public int daysBetweenDates(String date1, String date2) {
        String[] strs = date1.split("-");
        int days = getDays(new Integer(strs[0]), new Integer(strs[1]), new Integer(strs[2]));
        strs = date2.split("-");
        days -= getDays(new Integer(strs[0]), new Integer(strs[1]), new Integer(strs[2]));
        days = days < 0 ? -days : days;
        return days;
    }
}

