package selfsolution;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
	public static void main(String[] args) {
		sol sol = new sol();
		System.out.println(sol.validParentheses(3));
	}	
}

class sol { 
 List<String> validParentheses(int n) {
	    // Write your solution here.
	    List<String> result = new ArrayList();
	    if (n == 0) {
	      return result;
	    }
	    StringBuilder sb = new StringBuilder();
	    helper(n, n, sb, result);
	    return result;
	  }
	  
	  private  void helper(int left, int right, StringBuilder sb, List<String> result) {
	    if (left == 0 && right == 0){
	      result.add(sb.toString());
	      return;
	    } 
	    if (left > 0) {
	      sb.append("(");
	      helper(left - 1, right, sb, result);
	      sb.deleteCharAt(sb.length() - 1);
	    }
	    if (left < right && right > 0) {
	      sb.append(")");
	      helper(left, right - 1, sb, result);
	      sb.deleteCharAt(sb.length() - 1);
	    }
	  }
}