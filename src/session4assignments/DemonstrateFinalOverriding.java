package session4assignments;//Package declaration

/**
 * This class demonstrates the use of Final Keyword with method.
 *
 */
public class DemonstrateFinalOverriding extends DemonstrateFinalMethod 
{
	void showFinalMethod() // attempt to override final method from parent class fails
	{
		System.out.println("Child class method");//Prints message
	}

	public static void main(String[] args) // main method
	{
		DemonstrateFinalOverriding object = new DemonstrateFinalOverriding(); // object creation
		object.showFinalMethod(); // call to method showFinalMethod
	} // main method closed
} // Class closed
