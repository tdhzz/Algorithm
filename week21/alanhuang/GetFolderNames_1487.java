import java.util.HashMap;
import java.util.Map;

/**
 * @Classname GetFolderNames_1487
 * @Description 1487. 保证文件名唯一
 * @Date 2021/1/31 14:52
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GetFolderNames_1487 {
	public String[] getFolderNames(String[] names) {
		if (names == null || names.length == 0) {
			return null;
		}
		// 结果字符串数组
		String[] re = new String[names.length];
		// 保存文件出现的次数
		Map<String, Integer> map = new HashMap<>();
		for (int i=0; i<names.length; i++) {
			// 如果没有出现过，直接赋值即可
			if (!map.containsKey(names[i])) {
				re[i] = names[i];
				map.put(names[i], 1);
			} else {
				// 如果出现过，先取出之前出现的次数，再判断后序的有没有出现过
				int count=map.get(names[i]);
				while (map.containsKey(names[i] + "(" + count + ")")) {
					count++;
				}
				// 细节：记得更新
				map.put(names[i] + "(" + count + ")", 1);
				map.put(names[i], map.get(names[i])+1);
				// 本次的结果
				re[i] = names[i] + "(" + count + ")";
			}
		}
		return re;
	}
}
