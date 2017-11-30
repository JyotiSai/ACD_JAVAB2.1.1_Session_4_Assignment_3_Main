package session4assignments;//Package declaration

/**
 * This class demonstrates the use of Final Keyword with class.
 *
 */
public class DemonstrateFinalInheritance extends DemonstrateFinalClass // Inheritance of final class fails
{
	void showFinal() // method
	{
		System.out.println("This class cannot extend final parent class");
	}

	public static void main(String[] args) // main method
	{
		DemonstrateFinalInheritance object = new DemonstrateFinalInheritance(); // Object creation
		object.showFinal(); // call to method showFinal
	} // main method closed
} // End of class
