import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname ArrayRankTransform
 * @Description TODO
 * @Date 2020/12/20 21:33
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ArrayRankTransform {
	public int[] arrayRankTransform(int[] arr) {
		int[] clone = arr.clone(); // clone克隆，生成一个复本
		Map<Integer,Integer> map = new HashMap<>();
		Arrays.sort(clone);
		int k =1;
		for (int i = 0; i < arr.length; i++) {
			if(!map.keySet().contains(clone[i])){ // keySet() -> [key,value]
				// 如果键值对不存在，put
        /*
        if(map.get(temp[i])==null){  //有这个判断之后，重复的数据就不会被放到哈希表中
*/
				map.put(clone[i],k);
				k++;
			}
		}
		for(int i=0;i<clone.length;i++){
			arr[i] = map.get(arr[i]); // get(a[i]); key=a[i]时对应的value；
		}
		return arr;
	}
}
