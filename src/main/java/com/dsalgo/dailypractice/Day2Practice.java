package com.dsalgo.dailypractice;

import java.util.Scanner;

public class Day2Practice {

	// Recursion
	public static void printFromFirst(int[] arr, int n) {
		if (arr.length - 1 == n)
			return;
		System.out.print(arr[n] + " ");
		printFromFirst(arr, n + 1);
	}

	// Sort Array of 0,1,2
	public static int[] sortArray(int[] arr) {
		int l = 0, mid = 0, h = arr.length - 1;
		while (mid <= h) {
			switch (arr[mid]) {
			case 0: {
				int temp = arr[l];
				arr[l] = arr[mid];
				arr[mid] = temp;
				l++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				int temp1 = arr[h];
				arr[h] = arr[mid];
				arr[mid] = temp1;
				h--;
				break;
			}
			}
		}
		return arr;
	}

	public static void main(String[] arg) {
		int[] arr = new int[] { 1, 2, 0, 1, 0, 2, 1, 2, 2, 0, 2, 0, 1, 2, 1 };
		printFromFirst(arr, 0);
		System.out.println();
		int[] arr2 = sortArray(arr);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
