package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.set2;

public class problem_2_test {

	@Test
	public void test1() {
		set2 su = new set2();
		String expected = "1101";
		String actual = su.ten2x(13,2);
		assertTrue("" + actual, expected.equals(actual));
	}
	
	@Test
	public void test2() {
		set2 su = new set2();
		String expected = "ABCD";
		String actual = su.ten2x(43981,16);
		assertTrue("" + actual, expected.equals(actual));
	}
	
	@Test
	public void test3() {
		set2 su = new set2();
		String expected = "";
		String actual = su.ten2x(788,166);
		assertTrue("" + actual, expected.equals(actual));
	}
	
	
}
