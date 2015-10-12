package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.PSet4;

public class Problem_1 {

	@Test
	public void test1() {
		PSet4 ps1 = new PSet4();
		boolean expected = true;
		boolean actual = ps1.accept("PSWS",1);
		assertTrue("",expected == actual);
	}
	
	@Test
	public void test2() {
		PSet4 ps1 = new PSet4();
		boolean expected = true;
		boolean actual = ps1.accept("PSWP",2);
		assertTrue("",expected == actual);
	}
	
	@Test
	public void test3() {
		PSet4 ps1 = new PSet4();
		boolean expected = true;
		boolean actual = ps1.accept("PDSWPS",1);
		assertTrue("",expected == actual);
	}
	
	@Test
	public void test4() {
		PSet4 ps1 = new PSet4();
		boolean expected = true;
		boolean actual = ps1.accept("PSWS",1);
		assertTrue("",expected == actual);
	}

}
