/**
 * @Classname StrStr_28
 * @Description 实现 strStr() 28
 * @Date 2020/10/25 20:44
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StrStr_28 {
	public int strStr(String haystack, String needle) {
		if(needle == null || needle.length() == 0){
			return 0;
		}

		if(needle.length() > haystack.length()){
			return -1;
		}

		for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
			int j = 0;
			for(j = 0; j < needle.length(); j++){
				if(haystack.charAt(i + j) != needle.charAt(j)){
					break;
				}
			}

			if(j == needle.length()){
				return i;
			}
		}
		return -1;
	}
}
