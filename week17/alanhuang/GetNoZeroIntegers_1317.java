/**
 * @Classname GetNoZeroIntegers_1317
 * @Description 1317. 将整数转换为两个无零整数的和
 * @Date 2021/1/3 20:21
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GetNoZeroIntegers_1317 {
	public int[] getNoZeroIntegers(int n) {
		int [] res = new int[2];
		//n <= 10 时单独讨论一下
		if(n <= 10)
		{
			res[0] = 1;
			res[1] = n - 1;
			return res;
		}

		//求数字n的十进制长度
		int length = (int)Math.log10(n);

		//数字res[0]中每一位都是9,res[1]是与res[0]互补的数
		res[0] = (int)Math.pow(10, length) - 1;
		res[1] = n - res[0];

		//判断res[1]中十进制某一位是否为0
		int temp = res[1];
		int index = 1;

		while(temp > 0)
		{
			//如果res[1]某一位为0，则res[1]该位加上1，res[0]该位减去1
			if(temp % 10 == 0)
			{
				res[0] -= index;
				res[1] += index;
			}

			index *= 10;
			temp = temp / 10;
		}

		return res;
	}
}
