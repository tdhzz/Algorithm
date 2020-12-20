package com.hck.leetcode.easy;

import java.util.*;

public class Week15 {

    public static void main(String[] args) {
        System.out.println(isValid("({{{{}}}))"));
    }


    public static boolean isValid(String s) {
        //队列进出
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<Integer>() {{
            add(41);
            add(125);
            add(93);
        }};
        for (int i = 0; i < length; i++) {
            int c = (int) s.charAt(i);
            if (list2.contains(c)) {
                if (list.size() == 0 || c - list.get(list.size() - 1) > 2 || c - list.get(list.size() - 1) < 1) {
                    return false;
                } else {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(c);
            }
        }
        return list.size() == 0;
    }

    public int countLargestGroup(int n) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int maxValue = 0;
        for (int i = 1; i <= n; ++i) {
            int key = 0, i0 = i;
            while (i0 != 0) {
                key += i0 % 10;
                i0 /= 10;
            }
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            maxValue = Math.max(maxValue, hashMap.get(key));
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> kvpair : hashMap.entrySet()) {
            if (kvpair.getValue() == maxValue) {
                ++count;
            }
        }
        return count;
    }


    public int[] arrayRankTransform(int[] arr) {
        int res[] = arr.clone();
        Arrays.sort(res);
        Map<Integer, Integer> map = new HashMap<>();
        int k = 0;
        for (int num : res) {
            if (map.containsKey(num)) {
                continue;
            }
            map.put(num, ++k);
        }
        for (int i=0;i<arr.length;i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            res.add(0, level);
        }
        return res;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }



}
