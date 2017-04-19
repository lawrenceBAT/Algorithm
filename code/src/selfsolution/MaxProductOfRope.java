package selfsolution;

public class MaxProductOfRope {
	  public int maxProduct(int length) {
		    //经典DP问题
		    if (length == 2) {
		      return 1;
		    }
		    int[] array = new int[length + 1];
		    //Base case,宽泛的理解不止包括开头的sanitary，防止报错
		    //还有像DP的初始值设定，DP一般是用int array来存储subproblem
		    //初始值需要设到array[?]，是否需要global variable来记录
		    //这道题因为使用index作为求值运算，所以并未用到array[0]，
		    //而是从array[1]开始到array[length],这就是需要把input size增加作为output的例子
		    //结合切字典那道，但凡内层要用到input index，外面存结果的array size基本上都要 + 1
		    for (int i = 3; i < array.length; i++) {
		      for (int j = 1; j < i; j++) {
		    	/*外层for loop，是从长度为3的绳子的小号问题慢慢扩展到长度为N的原问题
		    	 * 内层for loop，j就是选切成j长度的左小段
		    	 * array[i]作为外层space的，初始值为0，在内层每个for loop里面判断是否更新，最后的即答案
		    	 */
		        array[i] = Math.max(array[i], j * Math.max(i - j, array[i - j]));
		      }
		    }
		    return array[length];
		  }
}
