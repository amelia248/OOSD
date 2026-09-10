// Student Name 	: Amelia Hamer
// Student Id Number: C00317858
// Date 			: 10-09-2026
// Purpose 			: LAB 01 : Thermometer class

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[])
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

		Thermometer thermB = new Thermometer(10);		// Create a second instance of our Thermometer class
		double tempB = thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is " + tempB );
	} // end main
} // end class ThermTest