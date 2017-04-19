package wrongsolution;


import java.util.ArrayList;
import java.util.List;

import api.TreeNode;

public class GetKeysInBinarySearchTreeInGivenRange {
	public List<Integer> getRange(TreeNode root, int min, int max) {
	    // Write your solution here.
	    List<Integer> result = new ArrayList();
	    getKeys(root, min, max, result);
	    return result;
	  }
	  
	  private void getKeys(TreeNode root, int min, int max, List<Integer> result) {
	    if (root == null) {
	      return;
	    }
	    if (root.key > min) {
	      getKeys(root.left, min, max, result);
	    } else {
	      return;
	    }
	    result.add(root.key);
	    if (root.key < max) {
	      getKeys(root.right, min, max, result);
	    } else {
	      return;
	    }
	  }
}

/*
 Input: TreeNode.fromLevelOrderSpecial(new String[]{"7","3","16","2","5","11","18","1","#","4","6","#","12","#","20"})
	expected:<[16]> but was:<[]>
 头里直接在root.key > min的statement里return了,不会执行下面的child node
 */
