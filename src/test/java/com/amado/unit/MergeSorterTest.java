package com.amado.unit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.amado.MergeSorter;

public class MergeSorterTest {

	@Test
	public void canCreateMergeSorter() {
		// ~given
		MergeSorter sorter = null;
		
		// ~when
		sorter = new MergeSorter();
		
		// ~then
		assertThat(sorter, is(notNullValue()));
	}

	@Test
	public void canSort() {
		// ~given
		final Integer[] unsortedIntegers = {6, 5, 3, 1, 7, 2, 4};
		final MergeSorter sorter = new MergeSorter();

		// ~when
		final List<Integer> sortedIntegers = sorter.sort(Arrays.asList(unsortedIntegers));
		
		// ~then {1, 2, 3, 4, 5, 5, 7};
		assertThat(sortedIntegers.get(0), is(1));
		assertThat(sortedIntegers.get(1), is(2));
		assertThat(sortedIntegers.get(2), is(3));
		assertThat(sortedIntegers.get(3), is(4));
		assertThat(sortedIntegers.get(4), is(5));
		assertThat(sortedIntegers.get(5), is(6));
		assertThat(sortedIntegers.get(6), is(7));
	}

}