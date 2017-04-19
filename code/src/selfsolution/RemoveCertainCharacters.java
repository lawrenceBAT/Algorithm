package selfsolution;

import java.util.HashSet;
import java.util.Set;

public class RemoveCertainCharacters {
	public String remove(String input, String t) {
	    // Write your solution here.
	    char[] inputArray = input.toCharArray();
	    Set<Character> set = buildSet(t);
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < inputArray.length; i++) {
	      if (!set.contains(inputArray[i])) {
	        sb.append(inputArray[i]);          //every time append is too expensive to space
	      }
	    }
	    return new String(sb);
	  }
	  
	  static private Set<Character> buildSet(String t) {
	     Set<Character> set = new HashSet();
	     char[] sb = t.toCharArray();;
	     for (char i : sb) {
	       set.add(i);
	     }
	     return set;
	  }
}
