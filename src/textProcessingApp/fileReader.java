package textProcessingApp;
import java.io.BufferedReader;
import java.io.FileReader;


public class fileReader {
	
	
	public  String fullText (String inputFilename) throws Exception{
		userInterface userInterface = new userInterface();
		FileReader fr = null;
		try{
			fr = new FileReader(inputFilename);
		} catch(Exception e) {
			System.out.println("File Not Found. Please make sure that the file is in a folder named process or that it exists. If you keep seeing this error please enter text directly into the program.");
			userInterface.enterTextInterface();
		}
		System.out.println("File Found.");
		BufferedReader br = new BufferedReader(fr); 
		String currentLine;
		
		int i = 0;
		String fullText = "";
		while ((currentLine = br.readLine()) != null) {
			i++;
			if(i==1){
				fullText = fullText + currentLine;
				} 
			else {
				fullText = fullText + " " + currentLine;
				}
		}
		fr.close();
		
		return fullText;
			}
}
