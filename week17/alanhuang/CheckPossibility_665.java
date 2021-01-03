/**
 * @Classname CheckPossibility_665
 * @Description 665. 非递减数列
 * @Date 2021/1/3 20:19
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CheckPossibility_665 {
	public boolean checkPossibility(int[] nums) {
		if(nums.length < 3){
			return true;
		}
		int count = 0;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i] > nums[i+1]){
				count++;
				if(count > 1){
					break;
				}
				if(i-1 >=0&&nums[i-1] > nums[i+1]){
					nums[i+1] = nums[i];
				}else{
					nums[i] = nums[i+1];
				}
			}
		}
		return count <= 1;
	}
}
