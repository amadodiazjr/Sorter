package com.amado;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter {
	private final List<List<Integer>> _sortedLists;
	
	public MergeSorter() {
		_sortedLists = new ArrayList<List<Integer>>();
	}
	
	public List<Integer> sort(final List<Integer> unsortedIntegers) {
		if (null == unsortedIntegers) {
			return new ArrayList<Integer>();
		}
		
		split(unsortedIntegers);
		
		return merge(_sortedLists);
	}
	
	private void split(final List<Integer> integers) {
		if (null == integers) {
			return;
		}
		
		if (1 == integers.size()) {
			_sortedLists.add(integers);
			return;
		}
		
		final List<Integer> aList = new ArrayList<Integer>();
		final List<Integer> bList = new ArrayList<Integer>();
		final Integer midIndex = integers.size() / 2;
		for (int i=0; i<midIndex; i++) {
			aList.add(integers.get(i));
		}

		for (int i=midIndex; i<integers.size(); i++) {
			bList.add(integers.get(i));
		}
		
		split(aList);
		split(bList);
	}
	
	private List<Integer> merge(final List<List<Integer>> sortedLists) {
		if (1 == sortedLists.size()) {
			return sortedLists.get(0);
		}

		final List<List<Integer>> newSortedLists = new ArrayList<List<Integer>>();
		final Integer size = sortedLists.size(); 
				
		Integer i = 0;
		while (i < size) {
			Integer aIndex = 0;
			Integer bIndex = 0;
			
			final List<Integer> aList = sortedLists.get(i);
			i++;
			final List<Integer> bList = (i < size) ? sortedLists.get(i) : new ArrayList<Integer>();
			final List<Integer> mergedList = new ArrayList<Integer>();

			while (aIndex < aList.size() || bIndex < bList.size()) {
				final Integer aValue = (aIndex < aList.size()) ? aList.get(aIndex) : null;
				final Integer bValue = (bIndex < bList.size()) ? bList.get(bIndex) : null;
				
				if (null != aValue && null != bValue) {
					if (aValue.compareTo(bValue) < 1) {
						mergedList.add(aValue);
						aIndex++;
					} else {
						mergedList.add(bValue);
						bIndex++;
					}
				} else if (null == aValue && null != bValue) {
					mergedList.add(bValue);
					bIndex++;
				} else if (null != aValue && null == bValue) {
					mergedList.add(aValue);
					aIndex++;
				} else if (null == aValue && null == bValue) {
					// do nothing
				}				
			}
				
			newSortedLists.add(mergedList);
			i++;
		}
		
		return merge(newSortedLists);
	}

 }