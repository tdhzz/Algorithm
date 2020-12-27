/**
 * @Classname FindJudge_997
 * @Description 找到小镇的法官
 * @Date 2020/12/27 20:02
 * @Author guangliang huang
 * @Copyright:2020 linkcm.com Inc. All rights reserved.
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FindJudge_997 {
	public int findJudge(int N, int[][] trust) {
		int[] inDegree = new int[N+1];
		int[] outDegree = new int[N+1];
		for (int i=0;i<trust.length;i++){
			inDegree[trust[i][1]]++;
			outDegree[trust[i][0]]++;
		}
		for (int i=1;i<=N;i++){
			if (inDegree[i]==N-1&&outDegree[i]==0){
				return i;
			}
		}
		return -1;
	}
}
