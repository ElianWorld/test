/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
 
 
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: buttom-up level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        ArrayList<Integer> flag = new ArrayList<>();
        int deep = 1;
        HashMap<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        map.put(root,1);
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode p = q.poll();
            int k = map.get(p);
            
            if(k == deep)
            {
                flag.add(p.val);
            }
            else
            {
                deep = k;
                result.add(flag);
                flag = new ArrayList<>();
                flag.add(p.val);
            }
            
            if(p.left != null)
            {
                map.put(p.left, k+1);
                q.offer(p.left);
            }
            if(p.right != null)
            {
                map.put(p.right, k+1);
                q.offer(p.right);
            }
        }
        result.add(flag);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int k = 0;
        for(int i = result.size() - 1;i >= 0;i--)
        {
            res.add(result.get(i));
        }
        return res;
    }
}