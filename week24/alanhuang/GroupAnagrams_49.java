import java.util.*;

/**
 * @Classname GroupAnagrams_49
 * @Description TODO
 * @Date 2021/3/21 19:27
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GroupAnagrams_49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String str : strs) {
			char[] array = str.toCharArray();
			Arrays.sort(array);
			String key = new String(array);
			List<String> list = map.getOrDefault(key, new ArrayList<String>());
			list.add(str);
			map.put(key, list);
		}
		return new ArrayList<List<String>>(map.values());
	}
}
