package laicodesolution;

import java.util.HashSet;
import java.util.Set;

public class DictionaryWordI {
	public boolean canBreak(String input, String[] dict) {
		//这道题一定要和selfsolution里面的MaxProductofRope相结合来思考
		Set<String> dictionary = toSet(dict);
		boolean[] canBreak = new boolean[input.length() + 1];
		canBreak[0] = true;
		//Base case and initialize,这里canBreak[0]=true，似乎input.length==0和==1的情况还没考虑
		
        /*这边缩进主要就是为了对比这几个length的关系
         * j < i = input.length < canBreak.length
         * 相当于j是在input内部切割的操作，canBreak要比input.size大1，
         * 是为了让index能从 i==1 开始记录到 i==input.length 的subproblem
         * canBreak.length并无实际的用处,作为index的i或者说input.length才有作用!
         */
				for (int i = 1; i < canBreak.length; i++) {
					for (int j = 0; j < i; j++) {
						if (canBreak[j] && dictionary.contains(input.substring(j, i))) {
							canBreak[i] = true;
						}
					}
				}
				
		return canBreak[canBreak.length - 1];
	}

	private Set<String> toSet(String[] dict) {
		Set<String> set = new HashSet();
		for (String s : dict) {
			set.add(s);
		}
		return set;
	}
}
