
public class µÈ¼Û¶þ²æÊ÷ {
	/**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        if(a.val != b.val) return false;
        if(isIdentical(a.left, b.left) && isIdentical(a.right, b.right)) return true; 
        else return false;
    }
}
