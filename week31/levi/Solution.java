
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        //count用于统计words中所有单词的最小字母出现次数，
        //大小设置为12是为了避免下面进行判定的时候出现越界而做的冗余处理
        int[] count = new int[12];
        for (String word:words)
            count[counts(word)]++;
        //计算后缀和，现在count[i]表示最小字母出现次数大于或等于i的单词总数。
        for (int i=9;i>=0;i--)
            count[i]+=count[i+1];
        //结果数组
        int[] result = new int[queries.length];
        //遍历queries中的每个字符串，利用前面计算得到的count数组，可以直接得到答案。
        for (int i=0;i<queries.length;i++)
            result[i]=count[counts(queries[i])+1];
        return result;
    }

    //counts方法用于统计字符串s中最小字母出现的次数
    private int counts(String s){
        char c = s.charAt(0);
        int count = 1;
        for (int i=1;i<s.length();i++){
            char temp = s.charAt(i);
            if (temp==c)
                count++;
            else if (temp<c){
                c=temp;
                count=1;
            }
        }
        return count;
    }


    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (;k > 0; k--) {
            int[][] newGrid = new int[grid.length][grid[0].length];
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length - 1; col++) {
                    newGrid[row][col + 1] = grid[row][col];
                }
            }

            for (int row = 0; row < grid.length - 1; row++) {
                newGrid[row + 1][0] = grid[row][grid[0].length - 1];
            }

            newGrid[0][0] = grid[grid.length - 1][grid[0].length - 1];

            grid = newGrid;
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> listRow = new ArrayList<>();
            result.add(listRow);
            for (int v : row) listRow.add(v);
        }

        return result;
    }


public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int reMax = maxNums(candies);
        ArrayList<Boolean> ans = new ArrayList<>();
        for(int i = 0;i < candies.length;i++){
            ans.add(extraCandies + candies[i] >= reMax);
        }
        return ans;
    }
    public static int maxNums(int[] nums){
        int max = nums[0];
        for (int i = 0;i < nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }


  public int[][] imageSmoother(int[][] M) {
        int m = M.length, n = M[0].length;
        int[][] newM = new int[m][n];
        for(int i=0; i<m; i++){
            int a = i-1 >= 0 ? i-1 : i;
            int c = i+1 < m ? i+1 : i;
            for(int j=0; j<n; j++){
                int b = j-1 >= 0 ? j-1 : j;
                int d = j+1 < n ? j+1 : j;
                int cnt = (d-b+1)*(c-a+1);
                int sum = 0;
                for(int x=a; x<=c; x++){ 
                    for(int y=b; y<=d; y++){
                        sum += M[x][y];
                    }
                }
                newM[i][j] = sum/cnt;
            }
        }
        return newM;
    }

public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        List<Point> A2 = new ArrayList(), B2 = new ArrayList();
        for (int i = 0; i < N*N; ++i) {
            if (A[i/N][i%N] == 1) A2.add(new Point(i/N, i%N));
            if (B[i/N][i%N] == 1) B2.add(new Point(i/N, i%N));
        }

        Set<Point> Bset = new HashSet(B2);

        int ans = 0;
        Set<Point> seen = new HashSet();
        for (Point a: A2) for (Point b: B2) {
            Point delta = new Point(b.x - a.x, b.y - a.y);
            if (!seen.contains(delta)) {
                seen.add(delta);
                int cand = 0;
                for (Point p: A2)
                    if (Bset.contains(new Point(p.x + delta.x, p.y + delta.y)))
                        cand++;
                ans = Math.max(ans, cand);
            }
        }

        return ans;
    }


