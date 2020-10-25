import java.util.ArrayList;
import java.util.List;

/**
 * @Classname BuildArray_1441
 * @Description 1441. 用栈操作构建数组
 * @Date 2020/10/25 20:52
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class BuildArray_1441 {
	private static final String PUSH = "Push";

	private static final String POP = "Pop";

	public List<String> buildArray(int[] target, int n) {
		int[] hash = new int[n + 1];
		int len = target.length;
		for (int i = 0; i < len; i++) {
			hash[target[i]] = 1;
		}
		// 需要考虑的最大数字
		int max = target[len - 1];

		// 最大步数2n
		int maxStep = n << 1;
		List<String> result = new ArrayList<>(maxStep);
		for (int i = 1; i <= n; i++) {
			if (hash[i] == 0) {
				result.add(PUSH);
				result.add(POP);
			} else {
				result.add(PUSH);
			}
			// 读取到最后个数字就终止
			if (i == max) {
				break;
			}
		}
		return result;
	}
}
