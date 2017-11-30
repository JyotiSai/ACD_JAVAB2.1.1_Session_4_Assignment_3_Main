package session4assignments;//Package declaration

/**
 * This class demonstrates the use of Final Keyword with variable.
 *
 */
public class DemonstrateFinalVariable 
{
	final int CONSTANT_VALUE = 100; // Variable declared final

	void method() //method
	{
		CONSTANT_VALUE = 10000; // Attempt to change final (Constant) variable fails
	}// method closed

	public static void main(String[] args) // main method
	{
		DemonstrateFinalVariable object = new DemonstrateFinalVariable(); // Object creation
		object.method(); // Call to method
	}// main method closed
}// class closed
