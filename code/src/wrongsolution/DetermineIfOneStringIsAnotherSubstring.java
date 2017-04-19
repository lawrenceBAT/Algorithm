package wrongsolution;

public class DetermineIfOneStringIsAnotherSubstring {
	 public int strstr(String large, String small) {
		 
		    if (small.length() == 0) {
		      return 0;
		    }
		    char[] largeArray = large.toCharArray();
		    char[] smallArray = small.toCharArray();
		    int curMaxLength = 0;
		    int index = 0;
		    for (int i = 0; i < large.length(); i++) {
		      if (largeArray[i] == smallArray[curMaxLength]) {
		        curMaxLength++;
		      } else {
		        curMaxLength = 0;
		        index = i + 1;
		      }
		      if (curMaxLength == smallArray.length) {
		        return index;
		      }
		    }
		    return -1;
		  }
}


/*  Input: "mississippi","issip"
	expected:<4> but was:<-1>  必须挨个遍历，DP会出现这种正确答案的部分嵌套在别的里面！！*/