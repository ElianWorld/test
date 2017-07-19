
public class ·­×ª¶þ²æÊ÷ {
	/**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root == null) return ;
        TreeNode flag = root.right;
        root.right = root.left;
        root.left = flag;
        invertBinaryTree(root.right);
        invertBinaryTree(root.left);
    }
}
