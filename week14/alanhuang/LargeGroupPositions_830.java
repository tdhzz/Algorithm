import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname LargeGroupPositions_830
 * @Description 830. 较大分组的位置
 * @Date 2020/12/13 17:04
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class LargeGroupPositions_830 {
	public List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> ans = new ArrayList();
		int i = 0, N = S.length();
		for (int j = 0; j < N; ++j) {
			if (j == N - 1 || S.charAt(j) != S.charAt(j + 1)) {
				if (j - i + 1 >= 3)
					ans.add(Arrays.asList(new Integer[]{i, j}));
				i = j + 1;
			}
		}

		return ans;
	}
}
