package griffith;
/*Student name: Alexandra Ivan
 * Student number: 3043349
 */
public class Conversions {
	
	//conversion of celsius degrees to fahrenheit degrees
	public double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	
	// conversion of fahrenheit degrees to celsius degrees
	public double fahrenheitToCelsius(double fahrenheit) {
		return (5.0/ 9 ) * (fahrenheit - 32 );
	}
	
	// transforms miles to kilometers
	public double milesToKilometer(double miles) {
		return miles * 1.60934;
	}
	
	// transforms kilometer to miles
	public double kilometerToMiles(double kilometer) {
		return kilometer * 0.621371;
	}
	
	// switches all uppercase values to lower case values
	public String upperCaseToLowerCase(String upperCase) {
		return upperCase.toLowerCase();
	}
	
	public String lowerCaseToUpperCase(String lowerCase) {
		
	}

}
