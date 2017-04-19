package selfsolution;

public class IsBinarySearchTreeOrNot {
	  public boolean isBST(TreeNode root) {
		    // Write your solution here.
		    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		  }
		  
		  private boolean isBST(TreeNode root, int min, int max) {
		    if (root == null) {
		      return true;
		    }
		    if (root.key >= max) {
		      return false;
		    }
		    if (root.key <= min) {
		      return false;
		    }
		    return isBST(root.left, min,root.key) &&
		    isBST(root.right, root.key, max);
		  }
	 
	  private class TreeNode {
		  public int key;
		  public TreeNode left;
		  public TreeNode right;
		  public TreeNode(int key) {
			  this.key = key;
		  }
	  }
}
