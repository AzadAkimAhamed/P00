import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	// Arrange
	int a = 4321;
	int b = 1234;
	int c = 0;
	
	Calculator cal = new Calculator();
	
	@Before
	public void setUp() throws Exception {
	}
	
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAdd() {
		// Act
		int actual = cal.add(a, b);
		
		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		// Act
		int actual = cal.subtract(a, b);
		
		// Assert 
		int expected = 3087;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiple() {
		// Act 
		int actual = cal.multiple(a, b);
		
		// Assert
		int expected = 5332114;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		// Act
		int actual = cal.divide(a, b);
		
		// Assert
		int expected = 3;
		assertEquals(expected, actual);
	}
	
}

