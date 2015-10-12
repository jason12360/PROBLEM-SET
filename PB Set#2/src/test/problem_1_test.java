package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.set2;


public class problem_1_test {

	@Test
	public void test1() {
		set2 su = new set2();
		int expected = 13;
		int actual = su.x2ten("1101",2);
		assertTrue("" + actual, expected == actual);
	}
	
	@Test
	public void test2() {
		set2 su = new set2();
		int expected = 43981;
		int actual = su.x2ten("ABCD",16);
		assertTrue("" + actual, expected == actual);
	}
	
	@Test
	public void test3() {
		set2 su = new set2();
		int expected = -1;
		int actual = su.x2ten("*788",16);
		assertTrue("" + actual, expected == actual);
	}
	
	@Test
	public void test4() {
		set2 su = new set2();
		int expected = -1;
		int actual = su.x2ten("*788",555);
		assertTrue("" + actual, expected == actual);
	}
	
}
