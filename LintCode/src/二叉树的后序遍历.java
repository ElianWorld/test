import java.util.ArrayList;

public class 二叉树的后序遍历 {
	/**
     * @param root: The root of binary tree.
     * @return: Postorder in ArrayList which contains node values.
     */
     ArrayList<Integer> array = new ArrayList<Integer>();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        if(root == null) return array;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        array.add(root.val);
        return array;
    }
}
