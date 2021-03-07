import java.util.HashMap;
import java.util.Map;

/**
 * @Classname NumberOfBoomerangs_447
 * @Description 447. 回旋镖的数量
 * @Date 2021/3/7 22:07
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class NumberOfBoomerangs_447 {
	public int numberOfBoomerangs(int[][] points) {

		int res = 0;

		//O(n^2)
		for(int i = 0; i < points.length;i++){
			Map<Integer, Integer> record = new HashMap<>();
			for(int j = 0; j < points.length; j ++){
				if( j != i ) {
					if(record.containsKey(distance(points[i], points[j]))){
						record.put(distance(points[i], points[j]),
								record.get(distance(points[i], points[j])) + 1);
					}
					else {
						record.put(distance(points[i], points[j]), 1);
					}
				}
			}
			for(int k : record.values()){
				if(k >= 2)//这里其实可以不加这句，因为k=1或k=0，结果都是0，但是加上可以减少一定的计算量。
				{
					res += k * (k - 1);
				}
			}

		}

		return res;
	}

	private int distance(int[] x, int[] y){

		return (x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]);
	}

}
