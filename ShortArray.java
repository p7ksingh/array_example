package com.L1;

import java.util.Arrays;

public class ShortArray {
	private static int[] shortArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 9, 7, 2 };
		int[] shortArr = shortArr(arr);
		System.out.println(Arrays.toString(shortArr));

	}

}
