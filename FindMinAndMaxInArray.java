package com.L1;

public class FindMinAndMaxInArray {
	private static void findMinAndMax(int[] arr) {
		int minNo = Integer.MAX_VALUE;
		int maxNo = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minNo) {
				minNo = arr[i];
			}
			if (arr[i] > maxNo) {
				maxNo = arr[i];
			}

		}
		System.out.println("Minimun no in array --> " + minNo + "\nMaxmum no in array  --> " + maxNo);

	}

	public static void main(String[] args) {
		int[] arr = { 7, 5, 4, 2, 1, 8, 9 };
		findMinAndMax(arr);

	}

}
