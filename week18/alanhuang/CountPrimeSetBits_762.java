/**
 * @Classname CountPrimeSetBits_762
 * @Description 二进制表示中质数个计算置位
 * @Date 2021/1/10 21:29
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CountPrimeSetBits_762 {
	public int countPrimeSetBits(int L, int R) {
		int ans = 0;
		for (int x = L; x <= R; ++x) {
			if (isSmallPrime(Integer.bitCount(x))) {
				ans++;
			}
		}
		return ans;
	}

	public boolean isSmallPrime(int x) {
		return (x == 2 || x == 3 || x == 5 || x == 7 ||
				x == 11 || x == 13 || x == 17 || x == 19);
	}
}
