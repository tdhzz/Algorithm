/**
 * @Classname NumMovesStones_1033
 * @Description 1033. 移动石子直到连续
 * @Date 2020/12/27 19:54
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class NumMovesStones_1033 {
	public int[] numMovesStones(int a, int b, int c) {
		int t;
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}   //将最小值给a，最大值给c
		if (a == b - 1 && a == c - 2)  //a，b，c相邻无法移动
		{
			return new int[]{0, 0};
		}
		if (b == a + 1 || c == b + 1 || b == a + 2 || b == c - 2)  //有两个数相邻或相近（隔一位）注意我们上面已经排除了3个数相邻情况
		{
			return new int[]{1, c - a - 2};
		}
		return new int[]{2, c - a - 2};  //其他情况
	}
}
