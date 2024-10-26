package com.L1;

public class SumOfElements {
	public static int sum(int[] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];

		}
		return result;
	}
	public static int[] shortArr(int[] arr) {
		int[] result=null;
		
		
		return result;
	}
	

	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 6, 7, 8, 9, 56, 4, 3 };
		int result = sum(arr1);
		int[] shortArr=shortArr(arr1);
		System.out.println(result);
	}

}
