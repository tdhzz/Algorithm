import java.util.List;

/**
 * @Classname GetImportance_690
 * @Description 690. 员工的重要性
 * @Date 2020/11/8 21:20
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class GetImportance_690 {
	public int getImportance(List<Employee> employees, int id) {
		//根据id找到根节点
		Employee root = null;
		for(Employee e : employees) {
			if(e.id == id) {
				root = e;
				break;
			}
		}
		//累加它的子树和
		int ans = root.importance;
		for(int sub : root.subordinates) {
			ans += getImportance(employees, sub);
		}
		return ans;
	}
}
class Employee {
	public int id;
	public int importance;
	public List<Integer> subordinates;
};
