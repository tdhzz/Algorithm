public boolean detectCapitalUse(String word) {
        int one =0;
        for(int i =0;i<word.length();i++){
            if('A'<=word.charAt(i)&&word.charAt(i)<='Z'){
                one++;
            }
        }
        if(one==0){
            return true;
        }
        else if(one==word.length()){
            return true;
        }
        else if('A'<=word.charAt(0)&&word.charAt(0)<='Z'&&one==1){
            return true;
        }
        else{
            return false;
        }
    }
 public String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";

        Set<String> banset = new HashSet();
        for (String word: banned) banset.add(word);
        Map<String, Integer> count = new HashMap();

        String ans = "";
        int ansfreq = 0;

        StringBuilder word = new StringBuilder();
        for (char c: paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            } else if (word.length() > 0) {
                String finalword = word.toString();
                if (!banset.contains(finalword)) {
                    count.put(finalword, count.getOrDefault(finalword, 0) + 1);
                    if (count.get(finalword) > ansfreq) {
                        ans = finalword;
                        ansfreq = count.get(finalword);
                    }
                }
                word = new StringBuilder();
            }
        }

        return ans;
    }
public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return logs;
    }

public String destCity(List<List<String>> paths) {
            HashSet<String> frist = new HashSet<>();
            HashSet<String> second = new HashSet<>();
            for (List<String> list : paths) {
                frist.add(list.get(0));
                second.add(list.get(1));
            }
            second.removeAll(frist);
            return second.iterator().next();
        }

public String customSortString(String S, String T) {
        int len = T.length();
        if(len <= 1) return T;
        int[] map = new int[26];
        int cnt = 0;
        for(int i = 0; i < S.length(); ++i) {
            map[S.charAt(i)-'a'] = ++cnt;   //给S串中的值排个优先级
        }
        Character[] chs = new Character[len];
        for(int i = 0; i < len; ++i) {
            chs[i] = T.charAt(i);
        }
        Arrays.sort(chs, (c1, c2) -> map[c1-'a']-map[c2-'a']);  //按照优先级升序排序
        char[] res = new char[len];
        for(int i = 0; i < len; ++i) {
            res[i] = chs[i];
        }
        return new String(res);
    }
