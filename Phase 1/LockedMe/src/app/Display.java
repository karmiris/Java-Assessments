package app;

public class Display {

	static void welcomeScreen () {
		System.out.println ("");
		System.out.println ("*** Prototype LockedMe.com Application ***");
		System.out.println ("Developer: Yannis Zoulias");
		System.out.println ("Date: 20 January, 2023");
		System.out.println ("");
	}
	
	static void goodbye () {
		System.out.println ("");
		System.out.println ("Thank you for using this program");
		System.out.println ("Have a nice day!");
	}
	
	static void menu (int menuScreen) {
		switch (menuScreen) {
		case 0:
			System.out.println ("");
			System.out.println ("--- MAIN MENU ---");
			System.out.println ("1) Display All Files in Working Directory");
			System.out.println ("2) Manage Files in Working Directory");
			System.out.println ("3) Exit the Application");
			System.out.println ("");
			break;
		case 1:
			System.out.println ("");
			System.out.println ("--- Manage Working Directory ---");
			System.out.println ("1) Add a File");
			System.out.println ("2) Delete a File");
			System.out.println ("3) Search a File");
			System.out.println ("4) Return to Main Menu");
			System.out.println ("");
			break;
		} 
		
	} 
	
}
