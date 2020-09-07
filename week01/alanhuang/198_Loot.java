/**
 * @Classname Loot
 * @Description TODO
 * @Date 2020/9/7 10:07
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Loot {
	public int rob(int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
		}

		if(nums.length == 1){
			return nums[0];
		}
		if(nums.length == 2){
			return Math.max(nums[0], nums[1]);
		}
		int length = nums.length;
		int temp = 0;
		int a = nums[length -1], b = Math.max(nums[length -1], nums[length-2]);
		for(int i = nums.length -3 ; i >=0; i--){
			temp = Math.max(nums[i] + a, b);
			a=b;
			b=temp;
		}
		return b;
	}
}
