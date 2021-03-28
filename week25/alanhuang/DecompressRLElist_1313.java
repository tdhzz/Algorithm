import java.util.ArrayList;
import java.util.List;

/**
 * @Classname DecompressRLElist_1313
 * @Description TODO
 * @Date 2021/3/28 21:20
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DecompressRLElist_1313 {
	public int[] decompressRLElist(int[] nums) {
		List<Integer> list = new ArrayList<>();
		//遍历一对数的第2个
		for(int i = 1;i<nums.length;i+=2){
			//然后让list添加第2个数n次(n的值为那一对数的第1个数)
			for(int j = 0;j<nums[i-1];j++){
				list.add(nums[i]);
			}
		}
		//再将list的值转换到数组即可
		int[] arr =new int[list.size()];
		for(int i = 0;i<arr.length;i++){
			arr[i] = list.get(i);
		}
		return arr;
	}
}
