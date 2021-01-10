import java.util.Arrays;

/**
 * @Classname CanBeEqual_1460
 * @Description TODO
 * @Date 2021/1/10 21:28
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CanBeEqual_1460 {
	public boolean canBeEqual(int[] target, int[] arr) {
		if (target.length != arr.length) {
			return false;
		}
		Arrays.sort(target);
		Arrays.sort(arr);
		for (int i = 0; i < target.length; i++) {
			if (target[i] != arr[i]) {
				return false;
			}
		}
		return true;
	}
}
