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
    
    public boolean canWinNim(int n) {
        List<Integer> list = new ArrayList<>();
        public int minDiffInBST(TreeNode root) {
            inOrder(root);
            int diff = Integer.MAX_VALUE;
            for(int i = 0;i < list.size() - 1;i++){
                if(list.get(i + 1) - list.get(i) < diff){
                    diff = list.get(i + 1) - list.get(i);
                }
            }
            return diff;
        }
    }

        public void inOrder(TreeNode root){
            if(root == null) return ;

            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
}
