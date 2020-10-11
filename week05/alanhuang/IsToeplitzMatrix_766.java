/**
 * @Classname IsToeplitzMatrix_766
 * @Description 托普利茨矩阵
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class IsToeplitzMatrix_766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
		int l1 = matrix.length;
		int l2 = matrix[0].length;

		for (int i = 0; i < l2; i++) {
			int index1 = 0, index2 = i;
			int value = matrix[0][i];

			while (index1 < l1 && index2 < l2) {
				if (value != matrix[index1][index2]) {
					return false;
				}
				index1++;
				index2++;
			}
		}

		for (int j = 1; j < l1; j++) {
			int index3 = j, index4 = 0;
			int value2 = matrix[j][0];

			while (index3 < l1 && index4 < l2) {
				if (value2 != matrix[index3][index4]) {
					return false;
				}
				index3++;
				index4++;
			}
		}
		return true;

	}

}
