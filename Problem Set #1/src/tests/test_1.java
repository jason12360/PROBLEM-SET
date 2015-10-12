package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_1 {
	
	@Test
	public void test1() {
		x2ten su = new x2ten();
		String r = "";
		int expected = -1;
		int actual = su.count_e(r);
		assertTrue("" + actual, expected == actual);
	}
	
	@Test
	public void test2() {
		x2ten su = new x2ten();
		String r = "e";
		int expected = 1;
		int actual = su.count_e(r);
		assertTrue("" + actual, expected == actual);
	}
	
	@Test
	public void test3() {
		x2ten su = new x2ten();
		String r = "bed";
		int expected = 1;
		int actual = su.count_e(r);
		assertTrue("" + actual, expected == actual);
	}
	
	@Test
	public void test4() {
		x2ten su = new x2ten();
		String r = "sadsadesadesdsa";
		int expected = 2;
		int actual = su.count_e(r);
		assertTrue("" + actual, expected == actual);
	}

}
