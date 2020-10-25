/**
 * @Classname Shuffle_1470
 * @Description 重新排列数组
 * @Date 2020/10/25 20:47
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Shuffle_1470 {
	public int[] shuffle(int[] nums, int n) {
		int[] res = new int[n*2];
		for(int i = 0;i<n;i++){
			res[i*2] = nums[i];
			res[i*2+1] =  nums[n+i];
		}
		return res;
	}
}
