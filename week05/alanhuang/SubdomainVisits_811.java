import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname SubdomainVisits_811
 * @Description 子域名访问计数
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SubdomainVisits_811 {
	public List<String> subdomainVisits(String[] cpdomains) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		List<String> list = new ArrayList<>();

		String[] t = null;
		String[] t2 = null;
		String t3 = null;
		int sum = 0;
		for (int i = 0; i < cpdomains.length; i++) {
			t = cpdomains[i].split(" ");
			t2 = t[1].split("\\.");
			t3 = t2[t2.length - 1];
			sum = Integer.valueOf(t[0]);
			for (int j = t2.length - 2; j >= 0; j--) {
				hashMap.put(t3, hashMap.getOrDefault(t3, 0) + sum);
				t3 = t2[j] + "." + t3;
			}
			hashMap.put(t3, hashMap.getOrDefault(t3, 0) + sum);
		}

		for (String s : hashMap.keySet()) {
			list.add(hashMap.get(s) + " " + s);
		}
		return list;
	}
}
