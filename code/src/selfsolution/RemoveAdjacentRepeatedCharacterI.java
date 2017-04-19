package selfsolution;

//Java solution里的解法更好

import java.util.ArrayList;
import java.util.List;

public class RemoveAdjacentRepeatedCharacterI {

	public static void main(String[] args) {
		
			String s = "aaaaabbc";
			Solution sol = new Solution();
			System.out.println(sol.deDup(s));
			
	}
	
	static class Solution {
		  public String deDup(String input) {
			  // Write your solution here.
			  char[] set = input.toCharArray();
			    if (input == null) {
			      return input;
			    }
			    if (set.length == 0) {
			      return new String(set);
			    }
			    int slow = 0;
			    int fast = 1;
			    for (; fast < set.length; fast++) {
			      if (set[slow] != set[fast]) {
			        set[++slow] = set[fast];
			      }
			    }
			    return new String(set, 0, slow + 1);
		  } 
		}
}
 
