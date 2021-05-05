import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Classname NumSpecialEquivGroups_893
 * @Description 893. 特殊等价字符串组
 * @Date 2021/5/5 15:07
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class NumSpecialEquivGroups_893 {
	public int numSpecialEquivGroups(String[] A) {
		Set<String> set = new HashSet<>();
		for (String str : A) {
			char[] chars = str.toCharArray();
			String odd = "", even = "";
			for (int i = 0; i < chars.length; i++) {
				//如果是奇数位
				if ((i & 1) == 1) {
					odd += str.charAt(i);
				} else {
					//如果为偶数位
					even += str.charAt(i);
				}
			}
			//排序后拼接
			char[] oddArr = odd.toCharArray();
			Arrays.sort(oddArr);
			char[] evenArr = even.toCharArray();
			Arrays.sort(evenArr);
			set.add(new String(oddArr) + new String(evenArr));
		}
		return set.size();
	}
}
