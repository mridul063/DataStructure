package com.mridul.algo;

public class SumOfArrayUsingRecursive {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4 };
		SumOfArrayUsingRecursive obj = new SumOfArrayUsingRecursive();
		System.out.println(obj.sum(array, array.length));
		System.out.println(obj.findMax(array, array.length));
		System.out.println(obj.findMin(array, array.length));
	}

	public int sum(int[] array, int length) {
		if (length <= 0) {
			return 0;
		} else {
			return array[length - 1] + sum(array, length - 1);
		}
	}

	public int findMax(int[] array, int length) {
		if (length == 1) {
			return array[0];
		} else {
			return Math.max(array[length - 1], findMax(array, length - 1));
		}
	}
	
	public int findMin(int[] array, int length) {
		if (length == 1) {
			return array[0];
		} else {
			return Math.min(array[length - 1], findMin(array, length - 1));
		}
	}

}
