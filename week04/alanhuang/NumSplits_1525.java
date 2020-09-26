/**
 * @Classname NumSplits_1525
 * @Description 字符串的好分割数目
 * @Date 2020/9/26 16:32
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class NumSplits_1525 {
	public int numSplits(String s) {
		int length = 26;
		int[] leftCount = new int[length];
		int[] rightCount = new int[length];
		int left = 0;
		int right = 0;
		for (char a : s.toCharArray()) {
			int count = a - 'a';
			if (rightCount[count] == 0) {
				right++;
			}
			rightCount[count]++;
		}

		int c = 0;
		for (char b : s.toCharArray()) {
			int num = b - 'a';
			if (leftCount[num] == 0) {
				left++;
			}
			if (rightCount[num] == 1) {
				right--;
			}
			leftCount[num]++;
			rightCount[num]--;
			if (left == right) {
				c++;
			}
		}
		return c;
	}
}
