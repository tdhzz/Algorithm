package com.hck.leetcode.easy;

public class Week17 {

    public static void main(String[] args) {
        int[] a = new int[]{1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(a,2));
    }


    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] target = count(licensePlate);
        String ans = "";
        for (String word : words)
            if ((word.length() < ans.length() || ans.length() == 0) &&
                    dominates(count(word.toLowerCase()), target))
                ans = word;
        return ans;
    }

    public boolean dominates(int[] count1, int[] count2) {
        for (int i = 0; i < 26; ++i)
            if (count1[i] < count2[i])
                return false;
        return true;
    }

    public int[] count(String word) {
        int[] ans = new int[26];
        for (char letter : word.toCharArray()) {
            int index = Character.toLowerCase(letter) - 'a';
            if (0 <= index && index < 26)
                ans[index]++;
        }
        return ans;
    }

    // nums[i] <= nums[i + 1]
    public static boolean checkPossibility(int[] nums) {
        boolean flag = true;
        int cur = 0, next = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[next] < nums[i]) {
                if (flag) {
                    cur++;
                    next++;
                    flag = false;
                    //判断是否需要交换
                    if (cur == 0) {
                        continue;
                    }
                    nums[next] = nums[cur];
                } else {
                    return false;
                }
            }
            cur++;
            next++;
        }
        return true;
    }


    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        for (int i = 1; i < n; i++) {
            String first = i + "";
            String next = (n - i) + "";
            if (!first.contains("0") && !next.contains("0")) {
                res[0] = Integer.parseInt(first);
                res[1] = Integer.parseInt(next);
            }
        }
        return res;
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            System.out.println(flowerbed[i]);
            if (flowerbed[i] == 0) {
                if (i==flowerbed.length-1||flowerbed[i + 1] == 0) {
                    if (i == 0 || flowerbed[i - 1] == 0) {
                        //种花
                        flowerbed[i] = 1;
                        n--;
                        if(n==0){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int minInsertions(String s) {
        int res = 0,leftCount = 0, index = 0;
        int length = s.length();
        while (index < length) {
            char c = s.charAt(index);
            if (c == '(') {
                leftCount++;
                index++;
            } else {
                if (leftCount > 0) {
                    leftCount--;
                } else {
                    res++;
                }
                if (index < length - 1 && s.charAt(index + 1) == ')') {
                    index += 2;
                } else {
                    res++;
                    index++;
                }
            }
        }
        res += leftCount * 2;
        return res;
    }


}
