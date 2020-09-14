package week02;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname CheckIfExist_1346
 * @Description TODO
 * @Date 2020/9/14 15:08
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CheckIfExist_1346 {
	public static boolean checkIfExist(int[] arr) {
		Map<Integer, Integer> resultMap = new HashMap<>();
		//转换为map集合
		for (int i = 0; i < arr.length; i++) {
			resultMap.put(arr[i], i);
		}
		for (int i = 0; i < resultMap.size(); i++) {
			//若存在两个整数 N 和 M，满足 N 是 M 的两倍
			if (resultMap.containsKey(arr[i] * 2) && resultMap.get(arr[i] * 2) != i) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = new int[]{11, 2, 5, 3};
		System.out.println(checkIfExist(arr));
	}
}
