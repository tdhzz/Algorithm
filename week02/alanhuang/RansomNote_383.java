import java.util.Arrays;

/**
 * @Classname RansomNote_383
 * @Description 赎金信
 * @Date 2020/9/14 14:15
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RansomNote_383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		char[] rChar = ransomNote.toCharArray();
		char[] mChar = magazine.toCharArray();
//		if (rChar.length < mChar.length){
//			return false;
//		}
		//对数组进行排序
		Arrays.sort(rChar);
		Arrays.sort(mChar);
		int i = 0, j = 0;
		while (i < rChar.length && j < mChar.length) {
			if (rChar[i] > mChar[j]) {
				j++;
			} else if (rChar[i] < mChar[j]) {
				return false;
			} else {
				i++;
				j++;
			}
		}
		return i == rChar.length;
	}
}
