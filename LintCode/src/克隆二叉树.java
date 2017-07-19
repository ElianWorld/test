
public class ¿ËÂ¡¶þ²æÊ÷ {
	/**
     * @param root: The root of binary tree
     * @return root of new tree
     */
    public TreeNode cloneTree(TreeNode root) {
        // Write your code here
        if(root == null) return null;
        TreeNode head = new TreeNode(root.val);
        head.right = cloneTree(root.right);
        head.left = cloneTree(root.left);
        return head;
    }
}
