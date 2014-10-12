package com.amado.unit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

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

	}

}