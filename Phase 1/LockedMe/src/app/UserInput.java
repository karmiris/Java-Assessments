package app;
import java.util.Scanner;

public class UserInput {

	static char GetCommand (int menu) {
		Scanner userCommand = new Scanner(System.in);  // Create a Scanner object
		System.out.println("What is your option?  ");
			
		String option = userCommand.nextLine();  // Read user input
				
		try {
			if (option.length() == 0) {
				option = "0"; // dummy value to display the menu again
				throw new Exception("Error: Please Type a Character");
			}
			
			if (option.charAt(0) != '1' &&
				option.charAt(0) != '2' &&
				option.charAt(0) != '3' &&
				(option.charAt(0) != '4' || menu != 1)
			) {
				option = "0"; // dummy value to display the menu again
				throw new Exception("Error: Please Type one of the Numbers provided");
			}
			
			if (option.length() > 1)
				throw new Exception("Warning: Only First Character Considered");
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return option.charAt(0);
	}
	
	
	
}
