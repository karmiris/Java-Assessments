package app;
import java.io.File;

public class RunCommands {
	
	static File workingDir = new File ("Files");
	
	static int ExecuteCommand (int menu, char command) {
		switch (menu) {
			case 0: 
				switch (command) {
					case '1': 
						ShowAllFiles();
						break;
					case '2': 
						return 1; // go to "manage folder" menu
					case '3': 
						break; // exit program; do nothing, handled by calling class
				}
				break;
			case 1:
				switch (command) {
					case '1': 
						CreateFile();
						break;
					case '2': 
						DeleteFile();
						break;
					case '3': 
						FindFile();
						break;
					case '4': 
						return 0; // go to "main" menu
				}
				break;
		}
		
		return menu; //no change
	}
	
	static private void ShowAllFiles() {
		String filenames[] = workingDir.list();
		BubbleSort(filenames);
		System.out.println ("All files in ascending order:");
		for (String x:filenames)
			System.out.println (x);
	}
	
	static private void CreateFile() {
		
	}
	
	static private void DeleteFile() {
	
	}
	
	static private void FindFile() {
	
	}
	
	// helpers
	static private void BubbleSort(String data[]) {
		//String output[] = {"xo","now","a"};
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data.length-i-1; j++)
				if (data[j].compareTo(data[j+1]) > 0 ) // output[j] > output[j+1]
				{
					String temp = data[j];
					data[j] = data [j+1];
					data[j+1] = temp;
				}
		//return output;
	}
	
}
