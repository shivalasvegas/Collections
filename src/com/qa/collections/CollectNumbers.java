package com.qa.collections;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CollectNumbers {
	private int min;
	private int limit;
	private boolean isPrint;
	
	Stream<Integer> streamNumbers; 
	List<Integer> collectNumbers;
	
	public CollectNumbers() {
		
	}
	
	public CollectNumbers(int min, int limit, boolean isPrint) {
		this.min  = min;
		this.limit = limit;	
		this.isPrint = isPrint;
	}
	
	public void collectStream() {
	streamNumbers = 
			Stream.iterate(this.min, i -> i + 1)
			.limit(this.limit);
	
	collectNumbers = streamNumbers
			.collect(Collectors.toList());	
	
	if (isPrint) System.out.println(collectNumbers);
	
	}
	

}
