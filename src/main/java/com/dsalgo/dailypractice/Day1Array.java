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
	
	public static void main(String []arg) {
		int[] missingNum = new int[99];
		int number = 100;
		for(int j=0;j<99;j++) {
			missingNum[j] = number--;
		}
		
		System.out.println(missingNum(missingNum));
	}
	
	
}
