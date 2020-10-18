/**
 * @Classname RotateString_793
 * @Description 796. 旋转字符串
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RotateString_793 {
	public boolean rotateString(String A, String B) {
		return A.length() == B.length() && (A+A).contains(B);
	}
}
