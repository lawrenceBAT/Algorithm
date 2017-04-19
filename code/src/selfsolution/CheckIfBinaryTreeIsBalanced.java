package selfsolution;

public class CheckIfBinaryTreeIsBalanced {
	public boolean isBalanced(TreeNode root) {
	    // Write your solution here.
	    if (root == null) {
	      return true;
	    }
	    if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
	      return false;
	    }
	    return isBalanced(root.left) && isBalanced(root.right);
	  }
	  
	  private int getHeight(TreeNode root) {
	    if (root == null) {
	      return 0;
	    }
	    return Math.max(getHeight(root.left),getHeight(root.right)) + 1;
	  }
	  
	private class TreeNode {
		public int value;
		public TreeNode left;
		public TreeNode right;
		TreeNode(){
			this.value = value;
		}
	}
}
