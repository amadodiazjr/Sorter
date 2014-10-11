package com.amado.unit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.amado.QuickSorter;

public class QuickSorterTest {

	@Test
	public void canCreateQuickSorter() {
		// ~given
		QuickSorter sorter = null;
		
		// ~when
		sorter = new QuickSorter();
		
		// ~then
		assertThat(sorter, is(notNullValue()));
	}

	@Test
	public void canSort() {
		// ~given
		final Integer[] unsortedIntegers = {3, 7, 8, 5, 2, 1, 9, 5, 4};
		final QuickSorter sorter = new QuickSorter();

		// ~when
		final List<Integer> sortedIntegers = sorter.sort(Arrays.asList(unsortedIntegers));
		
		// ~then {1, 2, 3, 4, 5, 5, 7, 8, 9};
		assertThat(sortedIntegers.get(0), is(1));
		assertThat(sortedIntegers.get(1), is(2));
		assertThat(sortedIntegers.get(2), is(3));
		assertThat(sortedIntegers.get(3), is(4));
		assertThat(sortedIntegers.get(4), is(5));
		assertThat(sortedIntegers.get(5), is(5));
		assertThat(sortedIntegers.get(6), is(7));
		assertThat(sortedIntegers.get(7), is(8));
		assertThat(sortedIntegers.get(8), is(9));
	}

}