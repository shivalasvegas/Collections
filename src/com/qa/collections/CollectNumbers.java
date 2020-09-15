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
	int numbersTen;
	
	public CollectNumbers() {
		
	}
	
	public CollectNumbers(int min, int limit, boolean isPrint) {
		this.min  = min;
		this.limit = limit;	
		this.isPrint = isPrint;
	}
	
	public List<Integer> collectStream() {
	this.streamNumbers = 
			Stream.iterate(this.min, i -> i + 1)
			.limit(this.limit);
	
	this.collectNumbers = this.streamNumbers
			.collect(Collectors.toList());	
	
	if (isPrint) System.out.println(this.collectNumbers);
	return this.collectNumbers;
	
	}
	
	public void collectStreamTens(List<Integer> timesTen) {
		//System.out.println(this.collectNumbers
		timesTen = 
				this.collectNumbers.stream()
					.map(x -> x*10)
					.collect(Collectors.toList());
		if (isPrint) System.out.println(timesTen);
		
	}

}
