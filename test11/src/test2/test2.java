package test2;

import java.util.HashSet;
import java.util.Set;

public class test2 {
	public static void main(String[] args) {
		String input = "abcdefghijk";
		String[] dict = {"abc","def"};
		int n = 4;
		int[] array = {1, 2, -3};
		largestSum(array);
	}

	public static int largestSum(int[] array) {
	    // Write your solution here.
	    int sum = array[0];
	    int result = array[0];
	    for (int i = 1; i < array.length; i++) {
	      if (sum + array[i] < 0) {
	        sum = 0;
	      } else {
	        sum += array[i];
	      }
	       Math.max(sum, result);
	      
	    }
	    return result;
	}
}
