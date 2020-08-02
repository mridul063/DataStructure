package com.mridul.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {

		BinarySearch method = new BinarySearch();
		List<Integer> list = method.createList(100);
		int searchNumber = 110;
		int result = method.binarySearch(list, searchNumber);
		if(result != -1) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}

	}

	private int binarySearch(List<Integer> list, int searchNumber) {
		int low = 0;
		int high = list.size() - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (list.get(mid) == searchNumber) {
				return searchNumber;
			} else if (list.get(mid) > searchNumber) {
				high = mid - 1;
			} else {
				low = mid + 1;
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
