package griffith;

/*Student name: Alexandra Ivan
 * Student number: 3043349
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void celsiusToFahrenheitConversionTest1() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare double variable called celsius
		double celsius = 32;
		// declare the actual variable that needs to be compared by calling the method
		double actual = conversions.celsiusToFahrenheit(celsius);
		// declacre the actual value of the variable that needs to be compared
		double expected = 89.6;
		// call the junit test and compare that the two values are equal
		assertEquals(expected, actual);
	}

	@Test
	void celsiusToFahrenheitConversionTest2() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare double variable called celsius
		double celsius = 38;
		// declare the actual variable that needs to be compared by calling the method
		double actual = conversions.celsiusToFahrenheit(celsius);
		// declare a random value for the variable that needs to be compared
		double unexpected = 102.80;
		// call the junit test and assert that the two values are not equal
		assertNotEquals(unexpected, actual);
	}

	@Test
	void celsiusToFahrenheitConversionTest3() {
		fail("Not yet implemented");
	}

	@Test
	void fahrenheitToCelsiusConversionTest1() {
		fail("Not yet implemented");
	}

	@Test
	void fahrenheitToCelsiusConversionTest2() {
		fail("Not yet implemented");
	}

	@Test
	void fahrenheitToCelsiusConversionTest3() {
		fail("Not yet implemented");
	}

	@Test
	void milesToKilometerConversionTest1() {
		fail("Not yet implemented");
	}

	@Test
	void milesToKilometerConversionTest2() {
		fail("Not yet implemented");
	}

	@Test
	void milesToKilometerConversionTest3() {
		fail("Not yet implemented");
	}

	@Test
	void kilometerToMilesConversionTest1() {
		fail("Not yet implemented");
	}

	@Test
	void kilometerToMilesConversionTest2() {
		fail("Not yet implemented");
	}

	@Test
	void kilometerToMilesConversionTest3() {
		fail("Not yet implemented");
	}

	@Test
	void upperCaseToLowerCaseConversionTest1() {
		fail("Not yet implemented");
	}

	@Test
	void upperCaseToLowerCaseConversionTest2() {
		fail("Not yet implemented");
	}

	@Test
	void upperCaseToLowerCaseConversionTest3() {
		fail("Not yet implemented");
	}

	@Test
	void lowerCaseToUpperCaseConversionTest1() {
		fail("Not yet implemented");
	}

	@Test
	void lowerCaseToUpperCaseConversionTest2() {
		fail("Not yet implemented");
	}

	@Test
	void lowerCaseToUpperCaseConversionTest3() {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
