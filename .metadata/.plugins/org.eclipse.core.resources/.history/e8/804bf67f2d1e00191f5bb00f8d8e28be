package com.test.tests;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionsTests {

	@Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

//	@Ignore
    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }
	
}
