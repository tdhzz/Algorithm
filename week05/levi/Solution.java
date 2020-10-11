 public static void main(String[] args) {
      //[[1,2,3,4],[5,1,2,3],[9,5,1,2]]
        int [][] array = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(array));
    }

    /**
     * 811
     * @param cpdomains
     * @return
     */
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<>();
        for(String cpdomain:cpdomains){
            String[] s = cpdomain.split(" ");
            //获取次数
            int num = Integer.parseInt(s[0]);
            String domain = s[1];
            addCount(map,domain,num);
            String[] split = domain.split("\\.");
            if(split.length>2){
                String topDomain = split[1]+"."+split[2];
                addCount(map,topDomain,num);
            }
            addCount(map,split[split.length - 1],num);
        }
        List<String> result = new ArrayList<>();
        for(String domain : map.keySet()){
            result.add(map.get(domain)+" "+domain);
        }
        return result;
    }

    private void addCount(Map<String,Integer> map,String key,Integer count){
        if(map.containsKey(key)){
            map.put(key,map.get(key)+count);
        }else{
            map.put(key,count);
        }
    }


    public static boolean isToeplitzMatrix(int[][] matrix) {
        int matrixLength = matrix.length;
        int arrayLength = matrix[0].length;
        for(int i=1;i<matrixLength;i++){
            //获取第一个矩阵
            int[] matrix1 = matrix[i-1];
            int[] matrix2 = matrix[i];
            //第一个矩阵的最后一位不要,第二矩阵的第一位不要,两矩阵相等
            for(int j=0;j<arrayLength-1;j++){
                if(matrix1[j]!=matrix2[j+1]){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 1154. 一年中的第几天
     * @param date
     * @return
     */
    public static int dayOfYear(String date) {
        int result = 0;
        String[] dateArray = date.split("-");
        Integer year = Integer.parseInt(dateArray[0]);
        Integer month = Integer.parseInt(dateArray[1]);
        Integer day = Integer.parseInt(dateArray[2]);
        //每月日数
        int[] months = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        //闰年判断
        if(month>1&&((year%4==0 && year%100!=0) || (year%400==0))){
            months[2] = 29;
        }
        for(int i=0;i<month;i++){
            result += months[i];
        }
        return result + day;
    }

    /**
     * 1418. 点菜展示表
     * @param orders
     * @return
     */
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> result = new ArrayList<>();
        int size = orders.size();
        //菜品数组
        Set<String> foodItemList = new TreeSet<>();
        Map<Integer,Map<String,Integer>> tableFoodNum = new TreeMap<>();
        for(int i=0;i<size;i++){
            List<String> orderDetail = orders.get(i);
            Integer tableNumber = Integer.parseInt(orderDetail.get(1));
            String foodItem = orderDetail.get(2);
            foodItemList.add(foodItem);
            if(!tableFoodNum.containsKey(tableNumber)){
                Map<String,Integer> foodNum = new HashMap<>();
                foodNum.put(foodItem,1);
                tableFoodNum.put(tableNumber,foodNum);
            }else{
                Map<String, Integer> foodNum = tableFoodNum.get(tableNumber);
                if(!foodNum.containsKey(foodItem)){
                    foodNum.put(foodItem,1);
                }else{
                    foodNum.put(foodItem,foodNum.get(foodItem)+1);
                }
                tableFoodNum.put(tableNumber,foodNum);
            }
        }
        //排序
        List<String> list = new ArrayList<>();
        list.add("Table");
        list.addAll(foodItemList);
        result.add(list);
        for(Integer table:tableFoodNum.keySet()){
            List<String> tableItem = new ArrayList<>();
            tableItem.add(table+"");
            Map<String, Integer> tableItemMap = tableFoodNum.get(table);
            for(int i=1;i<list.size();i++){
                if(tableItemMap.containsKey(list.get(i))){
                    tableItem.add(tableItemMap.get(list.get(i))+"");
                }else {
                    tableItem.add("0");
                }
            }
            result.add(tableItem);
        }
        return result;
    }

    /**
     * 1530. 好叶子节点对的数量
     * @param root
     * @param distance
     * @return
     */
    public int countPairs(TreeNode root, int distance) {
        int cnt = 0;
        List<String> nodes = new ArrayList<>();
        String path = "";
        dfs(root, nodes, path);
        for(int i = 0; i < nodes.size(); i++){
            for(int j = i+1; j < nodes.size(); j++){
                int k = 0;
                String n1 = nodes.get(i);
                String n2 = nodes.get(j);
                for(; k < Math.min(n1.length(), n2.length()); k++){
                    if(n1.charAt(k) != n2.charAt(k)) break;
                }
                if(n1.length()+n2.length()-2*k <= distance) cnt++;
            }
        }
        return cnt;
    }

    public void dfs(TreeNode root, List<String> nodes, String path){
        if(root.left == null && root.right == null){
            nodes.add(path);
            return;
        }
        if(root.left != null){
            dfs(root.left, nodes, path.concat("0"));
        }
        if(root.right != null){
            dfs(root.right, nodes, path.concat("1"));
        }
    }



 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

