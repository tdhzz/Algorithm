import java.util.Arrays;

/**
 * @Classname DailyTemperatures_739
 * @Description TODO
 * @Date 2021/3/7 22:11
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DailyTemperatures_739 {
	public int[] dailyTemperatures(int[] T) {
		int length = T.length;
		int[] ans = new int[length];
		int[] next = new int[101];
		Arrays.fill(next, Integer.MAX_VALUE);
		for (int i = length - 1; i >= 0; --i) {
			int warmerIndex = Integer.MAX_VALUE;
			for (int t = T[i] + 1; t <= 100; ++t) {
				if (next[t] < warmerIndex) {
					warmerIndex = next[t];
				}
			}
			if (warmerIndex < Integer.MAX_VALUE) {
				ans[i] = warmerIndex - i;
			}
			next[T[i]] = i;
		}
		return ans;
	}
}
