package com.hck.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Week09 {

    public static void main(String[] args) {

    }


    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int result = 0;
        while (left <= right) {
            int mid = left+ (right - left ) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
                result = mid;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }


    public int arrangeCoins(int n) {
        int result = 0;
        int start = 1;
        while (true){
            n = n - start;
            if(n>=0){
                result++;
            }else{
                break;
            }
            start = start + 1;
        }
        return result;
    }


    public int arrangeCoins2(int n) {
        return (int)(Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int num = Math.abs(nums[i]);
            int index = num - 1;
            if(nums[index] > 0){
                nums[index] *= -1;
            }
        }
        // 寻找没有标记的索引位置
        for(int i = 0; i < len; i++){
            if(nums[i] > 0){
                int num = i + 1;  //将索引转化为对应的元素
                result.add(num);
            }
        }
        return result;
    }

    public static boolean isBadVersion(int version) {
        return true;
    }

    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = n1 + n2 + carry;
            carry = tmp / 10;
            res.append(tmp % 10);
            i--; j--;
        }
        if(carry == 1) res.append(1);
        return res.reverse().toString();
    }


    public int getImportance(List<Employee> employees, int id) {
        Employee e = null;
        for(Employee employee:employees){
            if(employee.id==id){
                e = employee;
                break;
            }
        }
        int reuslt = e.importance;
        for(Integer temId : e.subordinates) {
            reuslt += getImportance(employees, temId);
        }
        return reuslt;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}
