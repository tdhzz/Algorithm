/**
 * @Classname MaxNumberOfBalloons_1189
 * @Description TODO
 * @Date 2021/3/7 22:09
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MaxNumberOfBalloons_1189 {
	public int maxNumberOfBalloons(String text) {
		int[] letters = new int[26];
		for(char ch :text.toCharArray()){
			letters[ch - 97] ++;
		}
		letters['l' - 97] /= 2;
		letters['o' - 97] /= 2;
		int min = Integer.MAX_VALUE;
		for(char ch : "balon".toCharArray()){
			if(letters[ch - 97] < min){
				min = letters[ch - 97];
			}
		}
		return min;
	}
}
