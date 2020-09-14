package week02;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname FindCommonChar_1002
 * @Description 查找常用字符
 * @Date 2020/9/14 15:32
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FindCommonChar_1002 {
	//参考题解解决方案
	public List<String> commonChars(String[] A) {
		//临时存储器，存放字符出现次数
		int[][] temp = new int[26][A.length];

		for (int i = 0; i < A.length; i++) {
			for (byte a : A[i].getBytes()) {
				temp[a - 97][i]++;
			}
		}
		//1 <= A.length <= 100
		//1 <= A[i].length <= 100
		//使用链式哈希存储结果
		List<String> list = new LinkedList<>();
		for (int i = 0; i < temp.length; i++) {
			int count = 100;
			for (int i1 = 0; i1 < A.length; i1++) {
				if (temp[i][i1] < count) count = temp[i][i1];
			}
			for (int j = 0; j < count; j++) {
				list.add(Character.toString((char) (i + 97)));
			}
		}
		return list;
	}
}
