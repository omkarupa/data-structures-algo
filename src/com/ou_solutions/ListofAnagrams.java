package com.ou_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListofAnagrams {

	public static void main(String[] args) {

		String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };

		Map<String,List<String>> map = new HashMap();
		
		for(String str : s)
		{
			char [] c = str.toCharArray();
			Arrays.sort(c);
			String s1 = new String(c);
			
			map.computeIfAbsent(s1, k -> new ArrayList()).add(str);
			
		}
		
		for(Map.Entry<String, List<String>> entry : map.entrySet() )
		{
			String key = entry.getKey();
			System.out.println(entry.getValue());
		}
		
	}

	

}
