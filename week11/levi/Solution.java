package com.ying.calculate;


import java.util.*;

public class Week11 {

    public static void main(String[] args) {
        int[] arr = {6,2,6,5,1,2};
        arrayPairSum(arr);
    }

    public int majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list);
        return list.get(list.get(list.size() / 2));
    }


    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Float, Integer> map = new TreeMap<>();
        int length = mat.length;
        int sLength = mat[0].length;
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < sLength; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
                if (mat[i][j] == 0 || j == sLength - 1) {
                    //1.1 1.2 这样子排大小
                    map.put(new Float(count + "." + new Float(i) / 100), i);
                    break;
                }
            }
        }
        int res[] = new int[k];
        int count = 0;
        for (Float key : map.keySet()) {
            res[count] = map.get(key);
            if (count == k - 1) {
                break;
            }
            count++;
        }
        return res;
    }


    int result = 0;

    public int sumRootToLeaf(TreeNode root) {
        traverse(root, 0);
        return result;
    }

    private void traverse(TreeNode root, int curr) {
        if (root == null) {
            return;
        }
        curr = (curr << 1) + root.val;
        if (root.left == null && root.right == null) {
            result += curr;
            return;
        }
        traverse(root.left, curr);
        traverse(root.right, curr);

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static int arrayPairSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list);
        int res = 0;
        int count = 1;
        for (Integer num : list) {
            if (count % 2 == 1) {
                res += num;
            }
            count++;
        }
        return res;
    }

    public List<Integer> getRow(int rowIndex) {
        int pre = 1;
        List<Integer> cur = new ArrayList<>();
        cur.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 1; j < i; j++) {
                int temp = cur.get(j);
                cur.set(j, pre + cur.get(j));
                pre = temp;
            }
            cur.add(1);
        }
        return cur;
    }

}
