package wrongsolution;

public class RemoveAdjacentRepeatedCharactersI {
	public String deDup(String input) {
	    char[] set = input.toCharArray();
	    char[] result = new char[set.length];  //错在这里，result的长度不对
	    if (input == null || input.length() == 0) {
	      return input;
	    }
	    int slow = 0;
	    result[slow] = set[0];
	    for (int fast = 1; fast < set.length; fast++) {
	      if (result[slow] != set[fast]) {
	        result[++slow] = set[fast];
	      }
	    }
	    return new String(result);
	  } 
}
