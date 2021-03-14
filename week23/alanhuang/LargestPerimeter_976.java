import java.util.Arrays;

/**
 * @Classname LargestPerimeter_976
 * @Description TODO
 * @Date 2021/3/14 19:05
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class LargestPerimeter_976 {
	public int largestPerimeter(int[] A) {
		Arrays.sort(A);
		for (int i = A.length - 1; i >= 2; --i) {
			if (A[i - 2] + A[i - 1] > A[i]) {
				return A[i - 2] + A[i - 1] + A[i];
			}
		}
		return 0;
	}
}
