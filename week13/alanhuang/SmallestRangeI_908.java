/**
 * @Classname SmallestRangeI_908
 * @Description 908. 最小差值 I
 * @Date 2020/12/5 20:01
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SmallestRangeI_908 {
	public int smallestRangeI(int[] A, int K) {
		int max = A[0], min = A[0];
		for (int i : A) {
			max = Math.max(i, max);
			min = Math.min(i, min);
		}
		return Math.max(0, max - min - 2 * K);
	}
}
