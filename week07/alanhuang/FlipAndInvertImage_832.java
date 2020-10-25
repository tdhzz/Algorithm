/**
 * @Classname FlipAndInvertImage_832
 * @Description 832. 翻转图像
 * @Date 2020/10/25 20:50
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FlipAndInvertImage_832 {
	public int[][] flipAndInvertImage(int[][] A) {
		int l1 = A.length;
		int l2 = A[0].length;

		int[][] ans = new int[l1][l2];

		for(int i = 0; i < l1; i++){
			for(int j = 0; j < l2; j++){
				ans[i][l2 - j - 1] = A[i][j] ^ 1;
			}
		}
		return ans;
	}
}
