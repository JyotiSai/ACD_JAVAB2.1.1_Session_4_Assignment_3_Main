package session4assignments;//Package declaration

/**
 * This class demonstrates the use of Final Keyword with constructor.
 *
 */
public class DemonstrateFinalConstructor 
{
	final int CONSTANT_VARIABLE; // final Variable declaration
	int a; // integer variable declaration

	DemonstrateFinalConstructor() // Constructor
	{
		CONSTANT_VARIABLE = 5; // Initialization of uninitialized final variable is a must in a constructor.
	}// Constructor closed

	final DemonstrateFinalConstructor(int a1) // Constructor cannot be declared final
	{
		this.a = a1; // Initialization of variable
	}

	void showMethod() // method to print constant variable
	{
		System.out.println(CONSTANT_VARIABLE);
	}

	public static void main(String[] args) // main method
	{
		DemonstrateFinalConstructor object = new DemonstrateFinalConstructor(); // object creation
		object.showMethod(); // Call to method
	} // main method closed
} // Class closed
