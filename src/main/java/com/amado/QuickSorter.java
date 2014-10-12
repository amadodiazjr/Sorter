package com.amado;

import java.util.ArrayList;
import java.util.List;

public class QuickSorter {

	public List<Integer> sort(final List<Integer> unsortedIntegers) {
		if (null == unsortedIntegers || unsortedIntegers.isEmpty()) {
			return new ArrayList<Integer>();
		}
		
		if (unsortedIntegers.size()==1) {
			return unsortedIntegers;
		}			
		
		final Integer pivotIndex = unsortedIntegers.size() / 2;
		final Integer pivotValue = unsortedIntegers.get(pivotIndex);
		
		final List<Integer> smallerIntegers = new ArrayList<Integer>();
		final List<Integer> biggerIntegers = new ArrayList<Integer>();
		for (int i=0; i<unsortedIntegers.size(); i++) {
			if (pivotIndex.equals(i)) {
				continue;
			}
			
			final Integer unsortedInteger = unsortedIntegers.get(i);
			if (unsortedInteger.compareTo(pivotValue) < 0) {
				smallerIntegers.add(unsortedInteger);
			} else {
				biggerIntegers.add(unsortedInteger);
			}
		}
		
		final List<Integer> sortedIntegers = new ArrayList<Integer>();
		sortedIntegers.addAll(sort(smallerIntegers));
		sortedIntegers.add(pivotValue);
		sortedIntegers.addAll(sort(biggerIntegers));
		
		return sortedIntegers;
	}
}