/**
 * @Classname LongestCommonPrefix_14
 * @Description 14. 最长公共前缀
 * @Date 2021/5/5 15:06
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class LongestCommonPrefix_14 {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) {
			return "";
		}
		String ans = strs[0];
		for(int i =1;i<strs.length;i++) {
			int j=0;
			for(;j<ans.length() && j < strs[i].length();j++) {
				if(ans.charAt(j) != strs[i].charAt(j)) {
					break;
				}
			}
			ans = ans.substring(0, j);
			if(ans.equals("")) {
				return ans;
			}
		}
		return ans;
	}
}
