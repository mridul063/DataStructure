package com.mridul.algo;

public class SelectionSort {

	public static void main(String[] args) {
		
		SelectionSort method = new SelectionSort();
		int[] array = {2,5,3,7,9,8,10};
		method.printArray(method.sort(array));

	}

	public int[] sort(int[] array) {

		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < length - 1; j++) {
				if (array[j] < array[smallestIndex]) {
					smallestIndex = j;
				}

			}
			int temp = array[i];
			array[i] = array[smallestIndex];
			array[smallestIndex] = temp;
		}
		return array;
	}
	
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
