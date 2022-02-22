package com.sapient.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sapient.lib.Division;



public class DivisionTest {

	
	@Test
	public void test() {
		int expected=6,actual;
		Division d = new Division();
		actual = d.div(12, 2);
		
		assertEquals(expected, actual);	
		
	}

}
