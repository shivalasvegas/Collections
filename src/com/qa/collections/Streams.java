package com.qa.collections;

import java.util.List;

public class Streams {

	public static void main(String[] args) {
		
		CollectNumbers colNum = new CollectNumbers(1, 10, true);
		
		List<Integer> listNum = colNum.collectStream();
		colNum.collectStreamTens(listNum);
				
	}

}
