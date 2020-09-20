package com.hck.leetcode.easy;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        //
        //
        //     boolean subsequence = isSubsequence("abc", "ahbgdc");

        //   System.out.println(subsequence);

        //   canConstruct("aa", "ab");
        //[,,]
        //["bbddabab","cbcddbdd","bbcadcab","dabcacad","cddcacbc","ccbdbcba","cbddaccc","accdcdbb"]
        //     String[] arr = new String[2];
        //    arr[0] = "bd";
        //   arr[1] = "accdcdbb";
        // System.out.println(commonChars(arr));
        //  System.out.println((-2)%2);
        int[] a = new int[]{1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(a, target));
    }

    /**
     * 排除n=1跟n=2的情况 然后第三个数等于前两个数相加
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int tem = 1;
        int tem2 = 2;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = tem + tem2;
            tem = tem2;
            tem2 = sum;
        }
        return sum;
    }


    public static int rob(int[] nums) {
        int cur = 0;
        int tmp = 0;
        int sum = 0;
        for (int i : nums) {
            sum = Math.max(cur, tmp + i);
            tmp = cur;
            cur = sum;
        }
        return sum;
    }

    public static boolean isPowerOfFour(int num) {
        while (true) {
            if (num == 0) {
                return false;
            }
            if (num == 1) {
                return true;
            }
            if ((num % 4) != 0) {
                return false;
            }
            num = num / 4;

        }
    }

    public static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int j = 0;
        int num = 0;
        for (int i = 0; i < sLength; i++) {
            char c = s.charAt(i);
            for (int z = j; z < tLength; z++) {
                j++;
                char c1 = t.charAt(z);
                if (c1 == c) {
                    num++;
                    break;
                }

            }
        }
        return num == s.length();
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        int rLength = ransomNote.length();
        if (rLength == 0) {
            return true;
        }
        Map<String, Integer> temMap = new HashMap<>();
        int mLength = magazine.length();
        int has = 0;
        for (int i = 0; i < rLength; i++) {
            char c = ransomNote.charAt(i);
            int j = 0;
            if (temMap.containsKey(c + "")) {
                j = temMap.get(c + "");
            }
            for (; j < mLength; j++) {
                if (magazine.charAt(j) == c) {
                    has++;
                    temMap.put(c + "", ++j);
                    break;
                }
            }
        }
        return has == rLength;
    }


    public boolean checkIfExist(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int cur = arr[i];
            if (cur == 0) {
                continue;
            }
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    if (cur == 2 * arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        List<String> tem = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String first = A[0];
        for (int i = 0; i < first.length(); i++) {
            result.add(first.charAt(i) + "");
        }
        int length = A.length;
        if (length == 1) {
            return new ArrayList<>();
        }
        for (int i = 1; i < length; i++) {
            String s = A[i];
            for (String c : result) {
                int z = 0;
                if (map.containsKey(c)) {
                    z = map.get(c);
                }
                for (; z < s.length(); z++) {
                    if (c.equals(s.charAt(z) + "")) {
                        tem.add(c);
                        map.put(c, ++z);
                        break;
                    }
                }
            }
            map.clear();
            if (tem.size() == 0) {
                return new ArrayList<>();
            }
            result.clear();
            result.addAll(tem);
            tem.clear();
        }
        return result;
    }


    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int length = queries.length;
        int ALength = A.length;
        int[] B = new int[length];
        int sum = 0;
        for (int j = 0; j < ALength; j++) {
            if (A[j] % 2 == 0) {
                sum += A[j];
            }
        }
        for (int i = 0; i < length; i++) {
            int add = queries[i][0];
            int index = queries[i][1];
            int ANum = A[index];
            int temAdd = add + ANum;
            if (temAdd % 2 == 0) {
                sum += add;
                if (ANum % 2 != 0) {
                    sum += ANum;
                }
            } else {
                if (ANum % 2 == 0) {
                    sum -= ANum;
                }
            }
            A[index] = A[index] + add;
            B[i] = sum;
        }
        return B;
    }

    /*[1,3,5,6]
            5*/
    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length == 0 || target <= nums[0]) {
            return 0;
        }
        int left = 0;
        int right = length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            int num = nums[mid];
            if (num == target) {
                return mid;
            }
            if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return mid + 1;
    }


    public int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node child : root.children) max = Math.max(max, maxDepth(child));
        return max + 1;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if(set.contains(j)){
                    continue;
                }
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    set.add(j);
                    break;
                }
            }
        }
        int[] newNums = new int[list.size()];
        for(int i=0;i<list.size();i++){
            newNums[i] = list.get(i);
        }
        return  newNums;
    }

    public boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        while (n!=1){
            if(n % 2!=0){
                return false;
            }
            n = n/2;
        }
        return true;
    }

    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        String replace = s.replace("1", "");
        return  s.length()-replace.length();
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
