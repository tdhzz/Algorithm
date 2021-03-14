import java.util.Arrays;
import java.util.Comparator;

/**
 * @Classname AllCellsDistOrder_1030
 * @Description TODO
 * @Date 2021/3/14 19:06
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class AllCellsDistOrder_1030 {
	public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
		int[][] ret = new int[R * C][];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				ret[i * C + j] = new int[]{i, j};
			}
		}
		Arrays.sort(ret, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return (Math.abs(a[0] - r0) + Math.abs(a[1] - c0)) - (Math.abs(b[0] - r0) + Math.abs(b[1] - c0));
			}
		});
		return ret;
	}
}
