package laicodesolution;

import laicodesolution.SubSetsOrder.Solution;

public class EditDistance {
	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "bc";
		editDistance(s1, s2);

	}
	
	public static int editDistance(String one, String two) {
	    // Write your solution here.
	    int[][] distance = new int[one.length() + 1][two.length() + 1];
	    for (int i = 0; i <= one.length(); i++) {
	      for (int j = 0; j <= two.length(); j++) {
	        if (i == 0) {
	          distance[i][j] = j;
	        } else if (j == 0) {
	          distance[i][j] = i;
	        } else if (one.charAt(i - 1) == two.charAt(j - 1)) {
	          distance[i][j] = distance[i - 1][j - 1];
	        } else {
	          distance[i][j] = Math.min(distance[i - 1][j] + 1, distance[i][j - 1] + 1);
	          distance[i][j] = Math.min(distance[i - 1][j - 1] + 1, distance[i][j]);
	        }
	        
	      }  
	    }
	    return distance[one.length()][two.length()];
	  }
}
