package com.op_pattu_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfAnagrams {
	
	public static void main(String[] args) {
		String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
		
		Map<String, List<String>> mapString=new HashMap<>();
		for(int i=0;i<s.length;i++) {
			char[] str=s[i].toCharArray();
			Arrays.sort(str);
			String strmap=new String(str);
			if(mapString.containsKey(strmap)) {
				List list=mapString.get(strmap);
				list.add(s[i]);
				mapString.put(strmap, list);
			}else {
				List list=new ArrayList();
				list.add(s[i]);
				mapString.put(strmap,list);
			}
			
		}
		
		System.out.println(mapString.values());
	}
	

}
