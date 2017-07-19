import java.util.ArrayList;

public class 二叉树的前序遍历 {
	/**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    ArrayList<Integer> array = new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        if(root == null) return array;
        array.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return array;
    }
}
