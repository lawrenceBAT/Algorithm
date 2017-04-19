package wrongsolution;

import java.util.ArrayList;
import java.util.List;

public class permutations1 {

	public static void main(String[] args) {
		
			String s = "abc";
			Solution sol = new Solution();
			System.out.println(sol.permutations(s));
			
	}
	
	
}
 
class Solution {
	  public List<String> permutations(String set) {
	    List<String> result = new ArrayList<String>();
	    if (set == null) {
	      return result;
	    }
	    char[] arraySet = set.toCharArray();
	    for (int i = 0; i < set.length(); i++) {
	      for (int j = i; j < set.length(); j++) {
	        swap(arraySet, i, j);
	        result.add(new String(arraySet));   //[abc, bac, cba, abc, acb, abc] DP will generate duplicate string
	        swap(arraySet, i, j);				//错在每次只做了一层的swap，然后就swap回去，保持原来的状态，没有recursive一层层的动作
	      }
	    }
	    return result;
	  }
	  
	  private void swap(char[] arraySet, int i, int j) {
	    char tmp = arraySet[i];
	    arraySet[i] = arraySet[j];
	    arraySet[j] = tmp;
	  }
	}