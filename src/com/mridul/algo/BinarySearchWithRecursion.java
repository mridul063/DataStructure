package com.mridul.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchWithRecursion {
	
	public static void main(String[] args) {

		BinarySearchWithRecursion method = new BinarySearchWithRecursion();
		List<Integer> list = method.createList(10);
		int searchNumber = 11;
		int result = method.binarySearch(list, searchNumber, 0, 9);
		if(result != -1) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}

	}
	
	private int binarySearch(List<Integer> list, int searchNumber, int low, int high) {
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (list.get(mid) == searchNumber) {
				return searchNumber;
			} else if (list.get(mid) > searchNumber) {
				return binarySearch(list,searchNumber,low,mid-1);
			} else {
				return binarySearch(list,searchNumber,mid+1,high);
			}

		}
		return -1;
	}
	
	private List<Integer> createList(int i) {
		List<Integer> integers = new ArrayList<>();
		for (int loop = 1; loop <= i; loop++) {
			integers.add(loop);
		}
		Collections.sort(integers);
		System.out.println(integers.size());
		return integers;

	}

}
