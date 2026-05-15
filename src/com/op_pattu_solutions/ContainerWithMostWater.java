package com.op_pattu_solutions;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		// expected output 49
		int left = 0;
		int right = arr.length - 1;
		int maxwater = 0;
		while (left < right) {

			int width = right - left;
			int height = Math.min(arr[right], arr[left]);
			maxwater = Math.max(maxwater, width * height);

			if (arr[left] < arr[right]) {
				left += 1;
			} else {
				right -= 1;
			}

		}
		System.out.println(maxwater);
	}

}
