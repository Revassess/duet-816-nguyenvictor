package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		int sum = 0;
		try {
			for (int i = 0; i < arr.length; i++) {

				int temp = arr[i];
				sum += temp;

			}
		}catch (Exception e){

		}
		return sum;
	}
}
