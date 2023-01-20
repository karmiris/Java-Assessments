package app;

public class RunMe {

	public static void main(String[] args) {
		int menu = 0; // menu screen: 0 - main menu; 1 - edit commands
		char command = 'a'; // command received by user
		
		Display.WelcomeScreen();
		
		do {
			Display.Menu(menu);
			command = UserInput.GetCommand(menu);
		}
		while (menu != 0 || command != '3'); // quit command;
		
		Display.Goodbye();

	}

}
