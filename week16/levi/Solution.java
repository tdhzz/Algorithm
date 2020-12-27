package com.leetCode.solution.easy;

import java.util.*;

public class Week16 {

    public static void main(String[] args) {

    }

    /**
     * 1033. 移动石子直到连续
     * <p>
     * 最大次数: max-min-2
     * 最小次数：连续 0
     * 有两数相减=1||=2  次数 1
     * 否则 2次
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int[] numMovesStones(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        int max = arr[2] - arr[0] - 2;
        int min = 0;
        if (arr[2] - arr[1] == 1 && arr[1] - arr[0] == 1) {
            min = 0;
        } else if (arr[1] - arr[0] == 1 || arr[1] - arr[0] == 2 || arr[2] - arr[1] == 1 || arr[2] - arr[1] == 2) {
            min = 1;
        } else {
            min = 2;
        }
        return new int[]{min, max};
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * 遍历输出. 二叉树的所有路径
     *
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        constructPaths(root, "", res);
        return res;
    }


    private void constructPaths(TreeNode root, String path, List<String> res) {
        if (root != null) {
            StringBuilder sb = new StringBuilder(path);
            sb.append(root.val);
            if (root.left == null && root.right == null) {
                res.add(sb.toString());
            } else {
                sb.append("->");
                constructPaths(root.left, sb.toString(), res);
                constructPaths(root.right, sb.toString(), res);
            }
        }
    }


    int pre, ans;

    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }

    /**
     * 相互映射
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(m1.containsKey(s1)){
                if(m1.get(s1)!=t1){
                    return false;
                }
            }
            if(m2.containsKey(t1)){
                if(m1.get(t1)!=s1){
                    return false;
                }
            }
            m1.put(s1,t1);
            m2.put(t1,s1);
        }
        return true;
    }


    public int findJudge(int N, int[][] trust) {
         Map<Integer,Integer> map = new HashMap<>();
         for(int i=1;i<=N;i++){
             map.put(i,0);
         }
         for(int i=0;i<trust.length;i++){
             map.remove(trust[i][0]);
             if(map.containsKey(trust[i][1])){
                 map.put(trust[i][1],map.get(trust[i][1])+1);
             }
         }
         if(map.size()!=1||map.values().iterator().next()!=N-1){
             return -1;
         }
         return map.keySet().iterator().next();
    }


}
