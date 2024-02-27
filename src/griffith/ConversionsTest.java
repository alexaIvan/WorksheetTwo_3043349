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
		// declare two object of Conversions class and name it conversions1 and conversions2
		Conversions conversions1 = new Conversions();
		Conversions conversions2 = new Conversions();
		// declare double variable called celsius1
		double celsius1 = 38;
		// declare double variable called celsius2
		double celsius2 = 37.6;
		// declare the actual variables that needs to be compared by calling the method 
        double value1 = conversions1.celsiusToFahrenheit(celsius1);
        double value2 = conversions2.celsiusToFahrenheit(celsius2);
        // call junit and assert that the two values are not equal 
        assertFalse(value1 == value2, "value 1 is not equal to value 2");	
	}

	@Test
	void fahrenheitToCelsiusConversionTest1() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare double variable called fahrenheit
		double fahrenheit = 32;
		// declare the actual variable that needs to be compared by calling the method
		double actual = conversions.fahrenheitToCelsius(fahrenheit);
		// declacre the actual value of the variable that needs to be compared
		double expected = 0;
		// call the junit test and compare that the two values are equal
		assertEquals(expected, actual);
	}

	@Test
	void fahrenheitToCelsiusConversionTest2() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare double variable called fahrenheit
		double fahrenheit = 103.8;
		// declare the actual variable that needs to be compared by calling the method
		double actual = conversions.fahrenheitToCelsius(fahrenheit);
		// declare a random value for the variable that needs to be compared
		double unexpected = 38;
		// call the junit test and assert that the two values are not equal
		assertNotEquals(unexpected, actual);
	}

	@Test
	void fahrenheitToCelsiusConversionTest3() {
		// declare two object of Conversions class and name it conversions1 and conversions2
		Conversions conversions1 = new Conversions();
		Conversions conversions2 = new Conversions();
		// declare double variable called fahrenheit1
		double fahrenheit1 = 108.7;
		// declare double variable called fahrenheit2
		double fahrenheit2 = 32;
		// declare the actual variables that needs to be compared by calling the method 
        double value1 = conversions1.fahrenheitToCelsius(fahrenheit1);
        double value2 = conversions2.fahrenheitToCelsius(fahrenheit2);
        // call junit and assert that the two values are not equal 
        assertFalse(value1 == value2, "value 1 is not equal to value 2");	
	}

	@Test
	void milesToKilometerConversionTest1() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare double variable called miles
		double miles = 30;
		// declare the actual variable that needs to be compared by calling the method
		double actual = conversions.milesToKilometer(miles);
		// declacre the actual value of the variable that needs to be compared
		double expected = 48.2802;
		// call the junit test and compare that the two values are equal
		assertEquals(expected, actual);
	}

	@Test
	void milesToKilometerConversionTest2() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare double variable called miles
		double miles = 40;
		// declare the actual variable that needs to be compared by calling the method
		double actual = conversions.milesToKilometer(miles);
		// declare a random value for the variable that needs to be compared
		double unexpected = 65;
		// call the junit test and assert that the two values are not equal
		assertNotEquals(unexpected, actual);
	}

	@Test
	void milesToKilometerConversionTest3() {
		// declare two object of Conversions class and name it conversions1 and
		// conversions2
		Conversions conversions1 = new Conversions();
		Conversions conversions2 = new Conversions();
		// declare double variable called miles1
		double miles1 = 56;
		// declare double variable called miles2
		double miles2 = 32;
		// declare the actual variables that needs to be compared by calling the method
		double value1 = conversions1.milesToKilometer(miles1);
		double value2 = conversions2.milesToKilometer(miles2);
		// call junit and assert that the two values are not equal
		assertFalse(value1 == value2, "value 1 is not equal to value 2");
	}

	@Test
	void kilometerToMilesConversionTest1() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare double variable called kilometer
		double kilometer = 32;
		// declare the actual variable that needs to be compared by calling the method
		double actual = conversions.kilometerToMiles(kilometer);
		// declacre the actual value of the variable that needs to be compared
		double expected = 19.883872;
		// call the junit test and compare that the two values are equal
		assertEquals(expected, actual);
	}

	@Test
	void kilometerToMilesConversionTest2() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare double variable called kilometer
		double kilometer = 40;
		// declare the actual variable that needs to be compared by calling the method
		double actual = conversions.kilometerToMiles(kilometer);
		// declare a random value for the variable that needs to be compared
		double unexpected = 25;
		// call the junit test and assert that the two values are not equal
		assertNotEquals(unexpected, actual);
	}

	@Test
	void kilometerToMilesConversionTest3() {
		// declare two object of Conversions class and name it conversions1 and
		// conversions2
		Conversions conversions1 = new Conversions();
		Conversions conversions2 = new Conversions();
		// declare double variable called kilometer1
		double kilometer1 = 45;
		// declare double variable called kilometer2
		double kilometer2 = 35;
		// declare the actual variables that needs to be compared by calling the method
		double value1 = conversions1.kilometerToMiles(kilometer1);
		double value2 = conversions2.kilometerToMiles(kilometer2);
		// call junit and assert that the two values are not equal
		assertFalse(value1 == value2, "value 1 is not equal to value 2");
	}

	@Test
	void upperCaseToLowerCaseConversionTest1() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare String variable called uppercase
		String uppercase = "HELLO";
		// declare the actual variable that needs to be compared by calling the method
		String actual = conversions.upperCaseToLowerCase(uppercase);
		// declacre the actual value of the variable that needs to be compared
		String expected = "hello";
		// call the junit test and compare that the two values are equal
		assertEquals(expected, actual);
	}

	@Test
	void upperCaseToLowerCaseConversionTest2() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare String variable called uppercase
		String uppercase = "HELLO";
		// declare the actual variable that needs to be compared by calling the method
		String actual = conversions.upperCaseToLowerCase(uppercase);
		// declare a random value for the variable that needs to be compared
		String unexpected = "hello world";
		// call the junit test and assert that the two values are not equal
		assertNotEquals(unexpected, actual);
	}

	@Test
	void upperCaseToLowerCaseConversionTest3() {
		// declare two object of Conversions class and name it conversions1 and
		// conversions2
		Conversions conversions1 = new Conversions();
		Conversions conversions2 = new Conversions();
		// declare String variable called uppercase1
		String uppercase1 = "ANIMALS";
		// declare String variable called uppercase2
		String uppercase2 = "PETS";
		// declare the actual variables that needs to be compared by calling the method
		String value1 = conversions1.upperCaseToLowerCase(uppercase1);
		String value2 = conversions2.upperCaseToLowerCase(uppercase2);
		// call junit and assert that the two values are not equal
		assertFalse(value1 == value2, "value 1 is not equal to value 2");
	}

	@Test
	void lowerCaseToUpperCaseConversionTest1() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare String variable called lowercase
		String lowercase = "pets";
		// declare the actual variable that needs to be compared by calling the method
		String actual = conversions.lowerCaseToUpperCase(lowercase);
		// declacre the actual value of the variable that needs to be compared
		String expected = "PETS";
		// call the junit test and compare that the two values are equal
		assertEquals(expected, actual);
	}

	@Test
	void lowerCaseToUpperCaseConversionTest2() {
		// declare an object of Conversions class and name it conversions
		Conversions conversions = new Conversions();
		// declare String variable called lowercase
		String lowercase = "hello everybody";
		// declare the actual variable that needs to be compared by calling the method
		String actual = conversions.lowerCaseToUpperCase(lowercase);
		// declare a random value for the variable that needs to be compared
		String unexpected = "HELLO WORLD";
		// call the junit test and assert that the two values are not equal
		assertNotEquals(unexpected, actual);
	}

	@Test
	void lowerCaseToUpperCaseConversionTest3() {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
