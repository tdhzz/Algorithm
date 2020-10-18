/**
 * @Classname CanWinNim_292
 * @Description Nim 游戏
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CanWinNim_292 {
	public boolean canWinNim(int n) {
		if (n%4==0){
			return false;
		}else{
			return true;
		}
	}

}
