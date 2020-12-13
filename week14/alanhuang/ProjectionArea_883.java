/**
 * @Classname ProjectionArea_883
 * @Description 883. 三维形体投影面积
 * @Date 2020/12/13 17:15
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ProjectionArea_883 {
	public int projectionArea(int[][] grid) {
		int ans = 0;

		for (int i = 0;i < grid.length;i++) {
			ans += getRowMax(grid,i);
		}

		for (int i = 0;i < grid[0].length;i++) {
			ans += getColMax(grid,i);
		}

		for (int i = 0;i < grid.length;i++) {
			for (int j = 0;j < grid[i].length;j++) {
				if (grid[i][j] != 0) {
					ans++;
				}
			}
		}

		return ans;
	}

	private int getRowMax(int[][] grid,int row) {
		int max = Integer.MIN_VALUE;

		for (int i = 0;i < grid[row].length;i++) {
			if (max < grid[row][i]) {
				max = grid[row][i];
			}
		}

		return max;
	}

	private int getColMax(int[][] grid,int col) {
		int max = Integer.MIN_VALUE;

		for (int i = 0;i < grid.length;i++) {
			if (max < grid[i][col]) {
				max = grid[i][col];
			}
		}

		return max;
	}

}
