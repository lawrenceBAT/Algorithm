package selfsolution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonNumberOfTwoArrays {
	 public List<Integer> common(List<Integer> A, List<Integer> B) {
		    // Write your solution here.
		    HashSet<Integer> set = new HashSet();
		    List<Integer> common = new ArrayList();
		    for (int i : A) {
		      set.add(i);
		    }
		    for (int i : B) {
		      if (set.contains(i)) {
		        if (!common.contains(i)) {
		          common.add(i);
		        }
		      }
		    }
		    return common;
		  }
}


// did not test