package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_2 {

	@Test
	public void test() {
		x2ten su = new x2ten();
		String r = "";
		int expected = -1;
		int actual = su.count_one_char(r, 'e');
		assertTrue("" + actual, expected == actual);
	}

}
