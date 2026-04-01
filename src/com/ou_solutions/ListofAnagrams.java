package com.ou_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ListofAnagrams {

	public static void main(String[] args) {

		String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(groupAnagrams(s));
	}

	private static Collection<List<String>> groupAnagrams(String[] s) {

		HashMap<String, List<String>> map = new HashMap();

		for (int i = 0; i < s.length; i++) {
			char[] c = s[i].toCharArray();
			Arrays.sort(c);

			String s1 = new String(c);

			if (map.containsKey(s1)) {
				List<String> list = map.get(s1);
				list.add(s[i]);
				map.put(s1, list);
			} else {
				List<String> list = new ArrayList<>();
				list.add(s[i]);
				map.put(s1, list);
			}

		}
		return map.values();

	}

}
