package com.ou_solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AncestorProblem {

	
	public static void main(String[] args) {
		
		  int[][] pairs = {
	                {1,3},
	                {2,3},
	                {3,6},
	                {5,6},
	                {5,7},
	                {4,5},
	                {4,8},
	                {8,9}
	        };
		  
		  Map<Integer,Integer> parentCount = new HashMap();
		  
		  for(int [] pair : pairs)
		  {
			  int parent = pair[0];
			  int child = pair[1];
			  
			  if(!parentCount.containsKey(parent))
			  {
				  parentCount.put(parent, 0);
			  }
			  
			  parentCount.put(child, parentCount.getOrDefault(child, 0) + 1);
			  
		  }
		  System.out.println(parentCount);
		  List<Integer> zeroParents = new ArrayList<>();
	        List<Integer> oneParent = new ArrayList<>();
	        
	        for(Map.Entry<Integer,Integer> entry : parentCount.entrySet() )
	        {
	        	

	            if(entry.getValue() == 0) {
	                zeroParents.add(entry.getKey());
	            }

	            if(entry.getValue() == 1) {
	                oneParent.add(entry.getKey());
	            }
	        	
	        }
	        

	        System.out.println("Zero Parents: " + zeroParents);

	        System.out.println("One Parent: " + oneParent);
	        
	}
	
}
