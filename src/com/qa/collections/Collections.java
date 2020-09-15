package com.qa.collections;

//import java.util.Arrays;
import java.util.ArrayList;

// original code without main

public class Collections {

	
	
	static void hundredArray() {
		int[] hunArray = new int[100];
		int num = 0;
		
		for (int i = 0; i<hunArray.length; i++) {
			num = i+1;
			hunArray[i] = num;
			//System.out.println("Adding ... " + i);
		}
	
		//System.out.println(Arrays.toString(hunArray));
		System.out.println("Added to array from " + hunArray[0] + " to " + hunArray[99]);
	}
	
	public static ArrayList<Integer> hunArrayList = new ArrayList<Integer>();
	 
	static void hundredArrayList() {
		//ArrayList<Integer> hunArrayList = new ArrayList<Integer>();
		int num = 0;
		
		for (int i = 0; i<900; i++) {
			num = 100 + i;
			hunArrayList.add(num);
			
		}
	
		System.out.println("Added to arraylist from " + hunArrayList.get(0) + " to " + hunArrayList.get(899));
	}
	
	static void multipliedArrayList() {
		ArrayList<Integer> multiArrayList = new ArrayList<Integer>();
		int num = 0;
		
		for (int i = 0; i<hunArrayList.size(); i++) {
			num = hunArrayList.get(i) * 10;
			multiArrayList.add(num);
			
		}
	
		System.out.println("Added to arraylist from " + multiArrayList.get(0) + " to " + multiArrayList.get(899));
	}
	
	
}


