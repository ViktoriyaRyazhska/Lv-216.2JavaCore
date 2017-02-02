import static org.junit.Assert.*;

import org.junit.Test;

import HomeWork4Task1.BelongToRangeTaskA;


public class BelongToRangeTests {
	
	//This method and range_help are unnecessary because method is static.
	/*BelongToRangeTaskA range_help;
	
	@Before
	public void before(){
		range_help = new BelongToRangeTaskA();
	}*/

	@Test
	public void testBelong1() {
		assertTrue(BelongToRangeTaskA.isBelongToRange(-5));
	}
	
	@Test
	public void testBelong2() {
		assertTrue(BelongToRangeTaskA.isBelongToRange(5));
	}
	
	@Test
	public void testBelong3() {
		assertTrue(BelongToRangeTaskA.isBelongToRange(0));
	}
	
	@Test
	public void testNotBelong1() {
		assertFalse(BelongToRangeTaskA.isBelongToRange(-5.001f));
	}
	
	@Test
	public void testNotBelong2() {
		assertFalse(BelongToRangeTaskA.isBelongToRange(5.001f));
	}
}
