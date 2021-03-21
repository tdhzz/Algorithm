import java.util.HashMap;
import java.util.Map;

/**
 * @Classname RomanToInt_13
 * @Description TODO
 * @Date 2021/3/21 19:20
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RomanToInt_13 {
	public int romanToInt(String s) {
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("IV", 4);
		map.put("V", 5);
		map.put("IX", 9);
		map.put("X", 10);
		map.put("XL", 40);
		map.put("L", 50);
		map.put("XC", 90);
		map.put("C", 100);
		map.put("CD", 400);
		map.put("D", 500);
		map.put("CM", 900);
		map.put("M", 1000);

		int ans = 0;
		for(int i = 0;i < s.length();) {
			if(i + 1 < s.length() && map.containsKey(s.substring(i, i+2))) {
				ans += map.get(s.substring(i, i+2));
				i += 2;
			} else {
				ans += map.get(s.substring(i, i+1));
				i ++;
			}
		}
		return ans;
	}
}
