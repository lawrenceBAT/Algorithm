package laicodesolution;

import java.util.ArrayList;
import java.util.List;

public class SubSetsOrder {

	public static void main(String[] args) {

		String s = "abc";
		Solution sol = new Solution();
		System.out.println(sol.subSetsII(s));

	}

	static class Solution {
		public List<String> subSetsII(String set) {
			List<String> result = new ArrayList<String>();
			if (set == null) {
				return result;
			}
			char[] arraySet = set.toCharArray();
			StringBuilder sb = new StringBuilder();
			helperII(arraySet, sb, 0, result);
			return result;
		}

		private void helperII(char[] set, StringBuilder sb, int index, List<String> result) {
			result.add(sb.toString());
			// maintains ascending order of the indices of picked characters.
			// choose the next picked index(the smallest one can be picked is
			// index).
			for (int i = index; i < set.length; i++) {
				sb.append(set[i]);
				helperII(set, sb, i + 1, result);
				sb.deleteCharAt(sb.length() - 1);
			}
		}
	}
}
