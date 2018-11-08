package com.dsalgo.dailypractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day3Practice {

	    // Java Streams Examples
	    //Operations in Streams

	    //1. Intermediate Operation
	    //. map , filter , sorted
	    //map example
	    public static void mapExample(){
	        List<Integer> numbers = Arrays.asList(5,12,2,7,10);
	        numbers.stream().map(a -> a*a).forEach(System.out::println);

	    }

	    // filter example
	    public static void filterExample(){
	        List<String> names = Arrays.asList("memes","sense","sarcasm","thai-thai");
	        List<String> streamed = names.stream().filter(x->x.startsWith("s")).collect(Collectors.toList());
	        streamed.stream().forEach(System.out::println);
	    }

	    //sorted example
	    public static void sortedExample(){
	        List<Integer> numbers = Arrays.asList(5,12,2,7,10);
	        List<String> names = Arrays.asList("memes","sense","sarcasm","thai-thai");
	        numbers.stream().sorted().forEach(System.out::println);
	        names.stream().sorted().forEach(System.out::println);
	    }


	    public static void main(String[] arg){
	        List<Integer> nums = Arrays.asList(2,4,10);
	       mapExample();
	       System.out.println();
	       filterExample();
	        System.out.println();
	        sortedExample();
	    }
}
