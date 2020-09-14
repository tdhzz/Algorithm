/**
 * @Classname Convert2Hexadecimal_405
 * @Description 数字转换为十六进制数
 * @Date 2020/9/14 14:39
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Convert2Hexadecimal_405 {
	public static String toHex(int num) {
		char[] hexCharMap = "0123456789abcdef".toCharArray();
		StringBuffer buffer = new StringBuffer();
		while (num != 0) {
			int last = num & 15;
			buffer.append(hexCharMap[last]);
			//若无符号，则右移
			num >>>= 4;
		}
		if (buffer.length() == 0) {
			buffer.append("0");
		}

		return buffer.toString();
	}

	public static void main(String[] args) {
		System.out.println(toHex(26));
	}
}
