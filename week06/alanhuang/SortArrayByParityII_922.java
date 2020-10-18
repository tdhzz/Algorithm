/**
 * @Classname SortArrayByParityII_922
 * @Description 按奇偶排序数组 II
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SortArrayByParityII_922 {

	public int[] sortArrayByParityII(int[] A) {
		int N = A.length;
		int[] ans = new int[N];

		int t = 0;
		for (int x: A) if (x % 2 == 0) {
			ans[t] = x;
			t += 2;
		}

		t = 1;
		for (int x: A) if (x % 2 == 1) {
			ans[t] = x;
			t += 2;
		}

		return ans;
	}
}
