/**
 * @Classname MinInsertions_1541
 * @Description 1541. 平衡括号字符串的最少插入次数
 * @Date 2021/1/3 20:24
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MinInsertions_1541 {
	public int minInsertions(String s) {
		int insertions = 0;
		int leftCount = 0;
		int length = s.length();
		int index = 0;
		while (index < length) {
			char c = s.charAt(index);
			if (c == '(') {
				leftCount++;
				index++;
			} else {
				if (leftCount > 0) {
					leftCount--;
				} else {
					insertions++;
				}
				if (index < length - 1 && s.charAt(index + 1) == ')') {
					index += 2;
				} else {
					insertions++;
					index++;
				}
			}
		}
		insertions += leftCount * 2;
		return insertions;
	}
}
