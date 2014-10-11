package com.amado.unit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

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

}
