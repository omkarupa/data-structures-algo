package com.ou_solutions;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int nums [] = {0,1,0,3,12};
		
		int insertPos = 0;
		
		for(int i = 0;i< nums.length;i++)
		{
			if(nums[i] != 0)
			{
				nums[insertPos] = nums[i];
				insertPos++;
			}
		}

	}

}
