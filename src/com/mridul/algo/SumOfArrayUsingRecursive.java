package com.mridul.algo;

public class SumOfArrayUsingRecursive {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4 };
		SumOfArrayUsingRecursive obj = new SumOfArrayUsingRecursive();
		System.out.println(obj.sum(array, array.length));
	}

	public int sum(int[] array, int length) {
		if (length <= 0) {
			return 0;
		} else {
			return sum(array, length - 1) + array[length-1];
		}
	}

}
