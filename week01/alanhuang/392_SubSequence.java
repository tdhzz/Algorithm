/**
 * @Classname Subsequence
 * @Description TODO
 * @Date 2020/9/7 10:08
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SubSequence {
	public boolean isSubsequence(String s, String t) {
		int sLength = s.length();
		int tLength = t.length();
		int i = 0,j = 0;
		while(i < sLength && j < tLength){
			if(s.charAt(i) == t.charAt(j)){
				i++;
				j++;
			}else{
				j++;
			}
		}
		return i == sLength;
	}
}
