import java.util.Arrays;

/**
 * @Classname KWeakestRows_1337
 * @Description 1337. 方阵中战斗力最弱的 K 行
 * @Date 2020/11/22 18:17
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class KWeakestRows_1337 {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[][] tmp = new int[mat.length][2];
		for (int i = 0; i < mat.length; i++) {
			tmp[i][0] = i;
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1) tmp[i][1] += 1;
			}
		}
		Arrays.sort(tmp, (o1, o2) -> o1[1] - o2[1]);
		int[] res = new int[k];
		for (int i = 0; i < k; i++) res[i] = tmp[i][0];
		return res;
	}
}
