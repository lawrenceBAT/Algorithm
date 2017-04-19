package selfsolution;

public class RightShiftN {
	public static void main(String[] args) {
		String input = "abcdefghijk";
		int n = 4;
		rightShift(input, 8);
	}

	public static String rightShift(String input, int n) {
	    
	    if (input.length() <= 1) {
	      return input;
	    }
	    char[] array = input.toCharArray();
	    int l = array.length;
	    n %= l;
	    /*有先转反小区间和先反转整个string两种处理顺序
	     * 两种方法里面的index不一样，be careful!
	     */
	    
	    reverse(array, 0, l - 1);
	    reverse(array, 0, n - 1);
	    reverse(array, n , l - 1);
	    return new String(array);
	  }
	  
	  private static void reverse(char[] array, int left, int right) {
	    while (left < right) {
	       char tmp = array[left];
	       array[left] = array[right];
	       array[right] = tmp;
	       left++;
	       right--;
	    }
	  }
}
