package app;
import java.util.Scanner;

public class UserInput {

	static char GetCommand (int menu) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
		return '3';
	}
}
