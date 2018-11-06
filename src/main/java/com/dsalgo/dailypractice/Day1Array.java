package com.dsalgo.dailypractice;

public class Day1Array {

	//1. Find the missing number in an array of 1 to 100
	
	public static int missingNum(int[] arr) {
		int sum = 0;
		for(int i=0;i<99;i++) {
			sum+= arr[i];
		}
		return (100*(100+1)/2)-sum;
	}
	
	//2. Find first non repeating number in an array
	
	public static int nonRepeat(int[] arr) {
		
		for(int i = 0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i] == arr[j]) count++;
			}
			if(count == 1) {
				return arr[i];
			}
		}
		return -1;
	}
	
	
	public static void main(String []arg) {
		int[] missingNum = new int[99];
		int[] nonRepeating = new int[] {23,32,12,23,76,32,54,12,98,91,422,2,7,9};
		int number = 100;
		for(int j=0;j<99;j++) {
			missingNum[j] = number--;
		}
		
		System.out.println(missingNum(missingNum));
		System.out.println(nonRepeat(nonRepeating));
	}
	
	
}
