package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;

	// Constructor Dep Injection: Autowiring by type from bean name
	// 'binarySearchImpl' via constructor to bean
	// named 'quickSortAlgorithm'
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	// Setter Dep Injection: Autowiring by type from bean name 'binarySearchImpl' to
	// bean named 'quickSortAlgorithm'

	public int binarySearch(int[] numbers, int numberToFind) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);

		System.out.println(sortAlgorithm);

		return 3;
	}

}
