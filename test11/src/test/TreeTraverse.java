package test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

 public class TreeNode {
   public int key;
   public TreeNode left;
   public TreeNode right;
   public TreeNode(int key) {
     this.key = key;
   }
 }

public class TreeTraverse {

	static List<Integer> result = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	  public List<Integer> postOrder(TreeNode root) {
	    // Write your solution here.
	    traverse(root);
	    System.out.println(result);
	  }
	  
	  
	
	}  
	
	private static void traverse(TreeNode root) {
	    if (root == null) {
	      return;
	    }
	    traverse(root.left);
	    traverse(root.right);
	    result.add(root.key);
	  }
}
