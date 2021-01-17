import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ReadBinaryWatch_401
 * @Description TODO
 * @Date 2021/1/17 19:24
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ReadBinaryWatch_401 {
	public List<String> readBinaryWatch(int num){
		List<String>times=new ArrayList<>();
		for(int h=0;h<12;h++){
			for(int m=0;m<60;m++){
				if(Integer.bitCount(h)+Integer.bitCount(m)==num) {
					times.add(String.format("%d:%02d",h,m));
				}
			}
		}
		return times;
	}
}
