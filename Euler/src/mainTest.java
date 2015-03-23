import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class mainTest {

	Euler1 eulertest = new Euler1();

	@Test
	public void test3() {
		
		int expected = 166833;
		int three=eulertest.get3();
		assertEquals(expected, three);

	}

	public void test5() {
		int five=eulertest.get5();
		int expected = 100500;
		assertEquals(expected, five);
	}

	public void test3And5() {
		int union=eulertest.union();
		int expected = 33165;
		assertEquals(expected, union);
	}
}