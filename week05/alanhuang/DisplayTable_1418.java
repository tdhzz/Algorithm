import java.util.*;

/**
 * @Classname DisplayTable_1418
 * @Description 点菜展示表
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DisplayTable_1418 {
	// TreeMap/TreeSet 去重 + 排序
	public List<List<String>> displayTable(List<List<String>> orders) {
		TreeSet<String> foodName = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {  // 按菜名的字典序排序
				return o1.compareTo(o2);
			}
		});
		// TreeMap最核心，将每一桌的点餐情况都记录下来
		TreeMap<String, HashMap<String, Integer>> order = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.parseInt(o1) - Integer.parseInt(o2);   // 按桌号排序
			}
		});
		// 填写TreeMap
		for (List<String> list : orders) {
			foodName.add(list.get(2));
			if (!order.containsKey(list.get(1))) {
				HashMap<String, Integer> hm = new HashMap<>();
				order.put(list.get(1), hm);
			}
			HashMap<String, Integer> temp = order.get(list.get(1));
			temp.put(list.get(2), temp.getOrDefault(list.get(2), 0) + 1);
		}
		List<List<String>> res = new ArrayList<>();
		// 生成结果集第一行
		List<String> list = new ArrayList<>();
		list.add("Table");
		for (String s : foodName) {
			list.add(s);
		}
		res.add(list);
		// 遍历TreeMap，生成结果集第2-n行
		for (String s : order.keySet()) {
			List<String> t = new ArrayList<>();
			HashMap<String, Integer> temp = order.get(s);
			t.add(s);
			for (String name : foodName) {
				if (temp.containsKey(name)) {
					t.add(temp.get(name) + "");
				} else {
					t.add("0");
				}
			}
			res.add(t);
		}
		return res;
	}

}

