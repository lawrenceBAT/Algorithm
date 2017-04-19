package wrongsolution;

public class LargestSquareOf1s {
	  public int largest(int[][] matrix) {
		    // come on，DP要把subproblem存在另外的array和matrix里面，
		    //怎么能在原来matrix上操作
		    int N = matrix.length;
		    int largest = 0;
		    
		    for (int i = 1; i < matrix.length; i++) {
		      for (int j = 1; j < matrix[0].length; j++) {
		         matrix[i][j] = Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]);
		         matrix[i][j] = Math.min(matrix[i][j], matrix[i][j - 1]) + 1;
		         Math.max(matrix[i][j], largest);                         
		      }
		    }
		    
		    return largest;
		  }
}
