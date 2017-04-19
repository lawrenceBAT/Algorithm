package laicodesolution;

import java.util.ArrayList;
import java.util.List;

public class SubSetsReverseOrder {

	public static void main(String[] args) {

		String s = "abc";
		Solution sol = new Solution();
		System.out.println(sol.subSets(s));
	}

	static class Solution {
		public List<String> subSets(String set) {
			// Write your solution here.
			List<String> result = new ArrayList();
			if (set == null) {
				return result;
			}
			char[] arraySet = set.toCharArray();
			int index = 0;
			StringBuilder s = new StringBuilder();
			subSet(arraySet, s, index, result);
			return result;
		}

		private void subSet(char[] arraySet, StringBuilder s, int index, List<String> result) {
			if (index == arraySet.length) {
				result.add(s.toString());
				return;
			}
			subSet(arraySet, s, index + 1, result);
			subSet(arraySet, s.append(arraySet[index]), index + 1, result);
			s.deleteCharAt(s.length() - 1);
		}
	}
}
