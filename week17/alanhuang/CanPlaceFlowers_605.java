/**
 * @Classname CanPlaceFlowers_605
 * @Description 605. 种花问题
 * @Date 2021/1/3 20:22
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CanPlaceFlowers_605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		int m = flowerbed.length;
		int prev = -1;
		for (int i = 0; i < m; i++) {
			if (flowerbed[i] == 1) {
				if (prev < 0) {
					count += i / 2;
				} else {
					count += (i - prev - 2) / 2;
				}
				prev = i;
			}
		}
		if (prev < 0) {
			count += (m + 1) / 2;
		} else {
			count += (m - prev - 1) / 2;
		}
		return count >= n;
	}
}
