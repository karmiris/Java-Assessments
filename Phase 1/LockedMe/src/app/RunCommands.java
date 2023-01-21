package app;
import java.io.File;

public class RunCommands {
	
	static File workingDir = new File ("Files");
	
	static int executeCommand (int menu, char command) {
		switch (menu) {
			case 0: 
				switch (command) {
					case '1': 
						showAllFiles();
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
						createFile();
						break;
					case '2': 
						deleteFile();
						break;
					case '3': 
						findFile();
						break;
					case '4': 
						return 0; // go to "main" menu
				}
				break;
		}
		
		return menu; //no change
	}
	
	static private void showAllFiles() {
		String fileNames[] = workingDir.list();
		bubbleSort(fileNames);
		System.out.println ("All files in ascending order:");
		for (String x:fileNames)
			System.out.println (x);
	}
	
	static private void createFile() {
		String fileName = getFilename();
		
		if (fileExists(workingDir.list(), fileName))
			System.out.println ("File \""+ fileName + "\" already exists!");
		else {
			File ff = new File(workingDir + "/" + fileName);
			try {
				ff.createNewFile();
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}
	
	static private void deleteFile() {
		String fileName = getFilename();
		
		if (fileExists(workingDir.list(), fileName)) {
			File ff = new File(workingDir + "/" + fileName);
			try {
				ff.delete();
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
		}
		else
			System.out.println ("File \""+ fileName + "\" does not exist in folder!");
	
	}
	
	static private void findFile() {
		String fileName = getFilename();
		
		if (fileExists(workingDir.list(), fileName))
			System.out.println ("File \""+ fileName + "\" exists in folder!");
		else
			System.out.println ("File \""+ fileName + "\" does not exist in folder!");
	}
	
	// helpers
	static private void bubbleSort(String data[]) {
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data.length-i-1; j++)
				if (data[j].compareTo(data[j+1]) > 0 ) // output[j] > output[j+1]
				{
					String temp = data[j];
					data[j] = data [j+1];
					data[j+1] = temp;
				}
	}
	
	static private boolean fileExists (String allFiles[], String file) {
		for (int i = 0; i < allFiles.length; i++)
			if (allFiles[i].compareTo(file) == 0)
				return true;
		
		return false;
	}
	
	static private String getFilename () {
		String output = "";
		
		do {
			try {
				output = UserInput.readFilename();
				if (output.isEmpty()) 
					throw new Exception("Error: Please write at least one character");
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
		}
		while (output.isEmpty());
		
		return output;
	}
	
}