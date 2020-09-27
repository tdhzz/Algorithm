 public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        int searchLength = length / 2;
        StringBuffer tem = new StringBuffer();
        for (int i = 0; i < searchLength; i++) {
            tem.append(s.charAt(i));
            if (length % (i + 1) == 0) {
                if (s.replace(tem, "").length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }


    public int[] sortArrayByParity(int[] A) {
        int targetLength = A.length;
        int[] an = new int[targetLength];
        int finalCur = targetLength - 1;
        int firstCur = 0;
        for (int i = 0; i < targetLength; i++) {
            if (A[i] % 2 == 0) {
                an[firstCur] = A[i];
                firstCur++;
            } else {
                an[finalCur] = A[i];
                finalCur--;
            }
        }
        return an;
    }


    public static int numSplits(String s) {
        int targetLength = s.length();
        HashSet<String> first = new HashSet<>();
        HashSet<String> second = new HashSet<>();
        int result = 0;
        for (int i = 0; i < targetLength - 1; i++) {
            first.add(s.charAt(i) + "");
            second.clear();
            for (int j = i + 1; j < targetLength; j++) {
                second.add(s.charAt(j) + "");
                if (second.size() > first.size()) {
                    break;
                }
            }
            if (second.size() == first.size()) {
                result++;
            }
        }
        return result;
    }


    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public int countBinarySubstrings(String s) {
        int result = 0;
        int pre = 0, cur = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                cur++;
            }else{
                result += Math.min(pre, cur);
                pre = cur;
                cur = 1;
            }
        }
        result += Math.min(pre, cur);
        return result;
    }
