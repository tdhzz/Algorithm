package week02;

/**
 * @Classname SumEvenAfterQueries_985
 * @Description 查询后的偶数和
 * @Date 2020/9/14 15:50
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SumEvenAfterQueries_985 {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] answer = new int[A.length];
		int sum = 0;
		//先求得A数组的偶数数组
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				sum += A[i];
			}
		}
//		对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，
//		会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
		for (int i = 0; i < A.length; i++) {
			int val = queries[i][0], index = queries[i][1];
			//A[index]如果为偶数，则减掉
			if (A[index] % 2 == 0) {
				sum -= A[index];
			}
			//加到A[index]后，如果为偶数，则增加
			A[index] += val;
			if (A[index] % 2 == 0) {
				sum += A[index];
			}
			answer[i] = sum;
		}
		return answer;
	}
}
