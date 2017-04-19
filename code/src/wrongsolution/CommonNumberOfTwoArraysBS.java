package wrongsolution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonNumberOfTwoArraysBS {
	public List<Integer> common(List<Integer> A, List<Integer> B) {

	    List<Integer> common = new ArrayList();
	    for (int i : B) {
	      int left = 0;
	      int right = A.size() - 1;
	      while (left <= right) {
	        int mid = left + (right - left) / 2;
	        if (i == A.get(mid)) {
	          common.add(i);
	          break;
	        } else if (i > A.get(mid)) {
	          left = mid + 1;
	        } else {
	          right = mid - 1;
	        }
	      }
	    }
	    return common;
	  }
}

/*  Input: java.util.Arrays.asList(1,2,3,4,5,6),java.util.Arrays.asList(1,3,3,3)
	expected:<[1,3]> but was:<[1,3,3,3]>

	Input: java.util.Arrays.asList(1,1,1,1,1),java.util.Arrays.asList(1,1,1,1)
	expected:<[1,1,1,1]> but was:<[1,1,1,1,1]>  */