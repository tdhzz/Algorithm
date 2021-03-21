/**
 * @Classname JudgeCircle_657
 * @Description TODO
 * @Date 2021/3/21 19:25
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class JudgeCircle_657 {
	public boolean judgeCircle(String moves) {
		int x = 0, y = 0;
		int length = moves.length();
		for (int i = 0; i < length; i++) {
			char move = moves.charAt(i);
			if (move == 'U') {
				y--;
			} else if (move == 'D') {
				y++;
			} else if (move == 'L') {
				x--;
			} else if (move == 'R') {
				x++;
			}
		}
		return x == 0 && y == 0;
	}

}
