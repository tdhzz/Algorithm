package com.leetCode.solution.easy;

import java.util.*;

/**
 * TODO
 *
 * @author chukai.hong
 * @version 1.0
 * @date 2021/1/25 8:16 下午
 */
public class Week21 {

    private boolean[] array;


    class MyHashSet {

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {
            array = new boolean[1000001];
        }

        public void add(int key) {
            array[key] = true;
        }

        public void remove(int key) {
            array[key] = false;
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            return array[key];
        }
    }


    public String getHint(String secret, String guess) {
        // secretArray 和 guessArray 分别记录 两个字符串中非公牛的各个数字的数量
        int[] secretArray = new int[10];
        int[] guessArray = new int[10];
        // 公牛
        int A = 0;
        for (int i = 0; i < secret.length(); i++) {
            // 如果同位的数字相等则，公牛++
            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
            } else {
                secretArray[secret.charAt(i) - '0']++;
                guessArray[guess.charAt(i) - '0']++;
            }
        }
        // 奶牛
        int B = 0;
        for (int i = 0; i < 10; i++) {
            // 不同位上的相同数字的数量
            B += Math.min(secretArray[i], guessArray[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(A).append('A').append(B).append('B').toString();
    }

    public static void main(String[] args) {
        String[] abc = new String[]{"cat", "bt", "hat", "tree"};
        System.out.println(countCharacters(abc, "atach"));
    }

    public static int firstUniqChar(String s) {
        int length = s.length();
        int res = -1;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (set.contains(c + "")) {
                continue;
            }
            int num = s.lastIndexOf(c);
            if (i == num) {
                return i;
            } else {
                set.add(c + "");
            }
        }
        return res;
    }

    public static int countCharacters(String[] words, String chars) {
        int res = 0;
        HashMap<Character, Integer> map = getMap(chars);
        for (String word : words) {
            HashMap<Character, Integer> map1 = getMap(word);
            if (eg(map, map1)) {
                res += word.length();
            }
        }
        return res;
    }

    public static boolean eg(HashMap<Character, Integer> resource, HashMap<Character, Integer> target) {
        for (Character c : target.keySet()) {
            if (resource.containsKey(c)) {
                if (resource.get(c) >= target.get(c)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static HashMap<Character, Integer> getMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }


    public String[] getFolderNames(String[] names) {
        if (names == null || names.length == 0) {
            return null;
        }
        // 结果字符串数组
        String[] re = new String[names.length];
        // 保存文件出现的次数
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<names.length; i++) {
            // 如果没有出现过，直接赋值即可
            if (!map.containsKey(names[i])) {
                re[i] = names[i];
                map.put(names[i], 1);
            } else {
                // 如果出现过，先取出之前出现的次数，再判断后序的有没有出现过
                int count=map.get(names[i]);
                while (map.containsKey(names[i] + "(" + count + ")")) {
                    count++;
                }
                // 细节：记得更新
                map.put(names[i] + "(" + count + ")", 1);
                map.put(names[i], map.get(names[i])+1);
                // 本次的结果
                re[i] = names[i] + "(" + count + ")";
            }
        }
        return re;
    }


}
