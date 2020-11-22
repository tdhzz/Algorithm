import java.util.ArrayList;
import java.util.List;

/**
 * @Classname GetRow_119
 * @Description 119. 杨辉三角 II
 * @Date 2020/11/22 18:22
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GetRow_119 {
	private List<Integer> generate(int rowIndex) {
		List<Integer> res = new ArrayList<>(rowIndex + 1);
		int numRows = rowIndex + 1;
		for (int index = 0; index < numRows; index++){
			if (index == 0){
				res.add(1);
			}else {
				long eachValOfRow = (long) res.get(index - 1) * (long) (numRows - index) / index;
				res.add((int) eachValOfRow);
			}
		}
		return res;
	}
}
