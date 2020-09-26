/**
 * @Classname SortArrayByParity_905
 * @Description 按奇偶排序数组
 * @Date 2020/9/26 16:27
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SortArrayByParity_905 {
	public int[] sortArrayByParity(int[] A) {
//		双指针算法
		int rightIndex = A.length - 1;
		int leftIndex = 0;
		int temp = 0;
		while (leftIndex < rightIndex) {
			if (A[leftIndex] % 2 == 0) {
				leftIndex++;
			} else {
				temp = A[rightIndex];
				A[rightIndex] = A[leftIndex];
				A[leftIndex] = temp;
				rightIndex--;
			}
		}
		return A;
	}
}
