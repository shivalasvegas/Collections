package com.qa.collections;


public class Streams {

	public static void main(String[] args) {
		
		CollectNumbers colNum = new CollectNumbers(1, 10, true);
		
		colNum.collectStream();
		colNum.collectStreamTens();
				
	}

}
