/**
 * @Classname FirstBadVersion_278
 * @Description 278. 第一个错误的版本
 * @Date 2020/11/8 21:16
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FirstBadVersion_278 {
	public int firstBadVersion(int n) {
		for (int version = 1; version < n; version++) {
			if (isBadVersion(version)) {
				return version;
			}
		}
		return n;
	}
}
