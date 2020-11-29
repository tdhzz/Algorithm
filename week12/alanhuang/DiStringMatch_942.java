/**
 * @Classname DiStringMatch_942
 * @Description 942. 增减字符串匹配
 * @Date 2020/11/29 18:59
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DiStringMatch_942 {
	public int[] diStringMatch(String S) {
		int N = S.length();
		int lo = 0, hi = N;
		int[] ans = new int[N + 1];
		for (int i = 0; i < N; ++i) {
			if (S.charAt(i) == 'I')
				ans[i] = lo++;
			else
				ans[i] = hi--;
		}

		ans[N] = lo;
		return ans;
	}
}
