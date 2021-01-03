/**
 * @Classname ShortestCompletingWord_748
 * @Description 748. 最短补全词
 * @Date 2021/1/3 20:17
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ShortestCompletingWord_748 {
	public String shortestCompletingWord(String licensePlate, String[] words) {
		int[] target = count(licensePlate);
		String ans = "";
		for (String word: words) {
			if ((word.length() < ans.length() || ans.length() == 0) &&
					dominates(count(word.toLowerCase()), target)) {
				ans = word;
			}
		}
		return ans;
	}

	public boolean dominates(int[] count1, int[] count2) {
		for (int i = 0; i < 26; ++i) {
			if (count1[i] < count2[i]) {
				return false;
			}
		}
		return true;
	}

	public int[] count(String word) {
		int[] ans = new int[26];
		for (char letter: word.toCharArray()){
			int index = Character.toLowerCase(letter) - 'a';
			if (0 <= index && index < 26) {
				ans[index]++;
			}
		}
		return ans;
	}
}
