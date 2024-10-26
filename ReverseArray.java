package com.L1;

import java.util.Arrays;

public class ReverseArray {
	private static int[] reverseArr(int[] arr) {
		int n = arr.length;
		int j = n;
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[j - 1] = arr[i];
			j--;
		}

		return arr1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 2, 6, 5 };
		int[] rArr = reverseArr(arr);
		System.out.println(Arrays.toString(rArr));

	}

}
