package app;

public class RunMe {

	public static void main(String[] args) {
		int menu = 0; // menu screen: 0 - main menu; 1 - edit commands
		char command = 'a'; // command received by user
		
		Display.welcomeScreen();
		
		do {
			Display.menu(menu);
			command = UserInput.getCommand(menu);
			menu = RunCommands.executeCommand(menu, command);
		}
		while (menu != 0 || command != '3'); // quit command;
		
		Display.goodbye();

	}

}
