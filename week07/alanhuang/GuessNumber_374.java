/**
 * @Classname GuessNumber_374
 * @Description 374. 猜数字大小
 * @Date 2020/10/25 20:55
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GuessNumber_374  extends GuessGame{
	public int guessNumber(int n) {
		int l = 1;
		int r = n;
		if(guess(l) == 0){
			return l;
		}
		if(guess(r) == 0){
			return r;
		}
		while(l!=r){
			int m = l + (r-l) / 2;
			int res = guess(m);
			if(res == 0){
				return m;
			}else if(res < 0){
				r = m;
			}else{
				l = m;
			}
		}
		return l;
	}
}
