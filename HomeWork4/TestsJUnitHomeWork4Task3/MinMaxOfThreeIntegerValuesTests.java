import static org.junit.Assert.*;

import org.junit.Test;

import HomeWork4Task1.MinMaxOfThreeIntegerValuesTaskB;


public class MinMaxOfThreeIntegerValuesTests {
	
	//This method and values_help are unnecessary because method is static.
	/*MinMaxOfThreeIntegerValuesTaskB values_help;
	
	@Before
	public void before(){
		//values_help = new MinMaxOfThreeIntegerValuesTaskB();
	} */

	@Test
	public void minTest1() {
		assertEquals(10, MinMaxOfThreeIntegerValuesTaskB.minOfThreeValues(45, 10, 36));
	}
	
	@Test
	public void minTest2() {
		assertEquals(-45, MinMaxOfThreeIntegerValuesTaskB.minOfThreeValues(-45, 10, 36));
	}
	
	@Test
	public void minTest3() {
		assertEquals(36, MinMaxOfThreeIntegerValuesTaskB.minOfThreeValues(145, 110, 36));
	}
	
	@Test
	public void minTest4() {
		assertEquals(-136, MinMaxOfThreeIntegerValuesTaskB.minOfThreeValues(-45, -110, -136));
	}
	
	@Test
	public void maxTest1() {
		assertEquals(145, MinMaxOfThreeIntegerValuesTaskB.maxOfThreeValues(145, 110, 36));
	}
	
	@Test
	public void maxTest2() {
		assertEquals(110, MinMaxOfThreeIntegerValuesTaskB.maxOfThreeValues(45, 110, 36));
	}
	
	@Test
	public void maxTest3() {
		assertEquals(365, MinMaxOfThreeIntegerValuesTaskB.maxOfThreeValues(145, 110, 365));
	}
	
	@Test
	public void maxTest4() {
		assertEquals(-145, MinMaxOfThreeIntegerValuesTaskB.maxOfThreeValues(-145, -5110, -5636));
	}
	
}
