package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.PSet4;

public class Problem_2 {

	@Test
	public void test1() {
		PSet4 ps1 = new PSet4();
		boolean expected = true;
		boolean actual = ps1.accept("(716)292-3233");
		assertTrue("",expected == actual);
	}
	
	@Test
	public void test2() {
		PSet4 ps2 = new PSet4();
		boolean expected = true;
		boolean actual = ps2.accept("+1-716-292-3233");
		assertTrue("",expected == actual);
	}
	
	@Test
	public void test3() {
		PSet4 ps3 = new PSet4();
		boolean expected = true;
		boolean actual = ps3.accept("292-3233");
		assertTrue("",expected == actual);
	}
	
	@Test
	public void test4() {
		PSet4 ps4 = new PSet4();
		boolean expected = false;
		boolean actual = ps4.accept("(+D-716-292-3233");
		assertTrue("",expected == actual);
	}

}
