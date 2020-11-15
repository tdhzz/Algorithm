package com.hck.leetcode.easy;

public class Week10 {

    public static void main(String[] args) {

    }


    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public int bitwiseComplement(int N) {
        int x = N;
        int count = 1;
        while(x>>>1 > 0){
            count++;
            x = x>>>1;
        }

        int tmp = 1<<count;
        return N ^ (tmp -1);
    }

    public int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;
        return a.length() > b.length() ? a.length() : b.length();
    }


    public int minStartValue(int[] nums) {
        int standard = 1;
        while (standard > 0)
        {
            int sum = standard;
            for (int i = 0; i < nums.length; i++)
            {
                sum += nums[i];
                if (sum < 1)
                {
                    break;
                }
                if (i == nums.length - 1)
                {
                    return standard;
                }
            }
            standard++;
        }
        return 0;
    }


    public int numberOfSteps (int num) {
       if(num==0||num==1){
           return num;
       }
       int res= 0 ;
       while (true){
           res++;
           if(num==1){
               break;
           }
           if(num%2==1){
               num--;
           }else{
               num = num/2;
           }
       }
       return res;
    }


}
