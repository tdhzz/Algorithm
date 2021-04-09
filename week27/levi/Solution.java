class Solution {

        /**
         * 深度优先算法
         *
         * @param root
         * @return
         */
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                int leftHeight = maxDepth(root.left);
                int rightHeight = maxDepth(root.right);
                return Math.max(leftHeight, rightHeight) + 1;
            }
        }

        /**
         * 广度优先算法
         *
         * @param root
         * @return
         */
        public int maxDepth2(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            int res = 0;
            if (root != null) {
                queue.offer(root);
                while (!queue.isEmpty()) {
                    int size = queue.size();
                    for (int i = 0; i < size; i++) {
                        TreeNode node = queue.poll();
                        if (node.left != null) {
                            queue.offer(node.left);
                        }
                        if (node.right != null) {
                            queue.offer(node.right);
                        }
                    }
                    res++;
                }
            }
            return res;
        }
    }

class Solution {
    private TreeNode ans;

    public Solution() {
        this.ans = null;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }
}


class Solution {
        List<Integer> answer = new ArrayList<>();
        int base, count, maxCount;

        public int[] findMode(TreeNode root) {
            dfs(root);
            int[] mode = new int[answer.size()];
            for (int i = 0; i < answer.size(); ++i) {
                mode[i] = answer.get(i);
            }
            return mode;
        }

        public void dfs(TreeNode o) {
            if (o == null) {
                return;
            }
            dfs(o.left);
            update(o.val);
            dfs(o.right);
        }

        public void update(int x) {
            if (x == base) {
                ++count;
            } else {
                count = 1;
                base = x;
            }
            if (count == maxCount) {
                answer.add(base);
            }
            if (count > maxCount) {
                maxCount = count;
                answer.clear();
                answer.add(base);
            }
        }
    }


class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<Double> list = new ArrayList<>();
            if (root != null) {
                queue.offer(root);
                while (!queue.isEmpty()) {
                    int size = queue.size();
                    Double sum = 0d;
                    for (int i = 0; i < size; i++) {
                        TreeNode node = queue.poll();
                        sum+=node.val;
                        if (node.left != null) {
                            queue.offer(node.left);
                        }
                        if (node.right != null) {
                            queue.offer(node.right);
                        }
                    }
                    list.add(sum/size);
                }
            }
            return list;
        }
    }


class Solution {
        int res = 0;
        public int rangeSumBST(TreeNode root, int low, int high) {
            if (root == null) {
                return 0;
            }
            if (root.val >= low && root.val <= high) {
                res += root.val;
            }
            if(root.val==low){
                root.right = null;
            }
            if(root.val==high){
                root.left = null;
            }
            rangeSumBST(root.right, low, high);
            rangeSumBST(root.left, low, high);
            return res;
        }
    }




