/**
 * @Classname NextGreatestLetter_744
 * @Description 744. 寻找比目标字母大的最小字母
 * @Date 2020/12/5 19:57
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class NextGreatestLetter_744 {
	public char nextGreatestLetter(char[] letters, char target) {
		int left = 0;
		int right = letters.length;

		if (target >= letters[letters.length - 1]) {//循环比较的处理
			return letters[0];
		} else {
			while (left < right) {//二分搜索的应用
				int mid = (left + right) / 2;
				if (letters[mid] <= target) left = mid + 1;
				if (letters[mid] > target) right = mid;
			}
			return letters[left];
		}
	}
}
