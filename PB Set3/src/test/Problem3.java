package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.set3;

public class Problem3 {

	@Test
	public void test1() {
		set3 su = new set3();
		String expected = "";
		String actual = su.encode("","");
		assertTrue("" + actual, expected.equals(actual));
	}
	


	@Test
	public void test2() {
		set3 su = new set3();
		String expected = "FIREFLY";
		String actual = su.encode("firefly","");
		assertTrue("" + actual, expected.equals(actual));
	}
	
	@Test
	public void test3() {
		set3 su = new set3();
		String expected = "ZEBRACDFG";
		String actual = su.encode("ABCDEFGHI","Zebra");
		assertTrue("" + actual, expected.equals(actual));
	}
}
