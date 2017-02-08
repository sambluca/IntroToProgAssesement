package convertingStringToChar;
import java.io.BufferedReader;
import java.io.FileReader;


public class fileReader {
	
	
	public  String fullText (String inputFilename) throws Exception{
		int max = 50;
		String lines[] = new String[max];
		FileReader fr = new FileReader(inputFilename);
		BufferedReader br = new BufferedReader(fr); 
		String currentLine;
		
		int i = 0;
		String fullText = "";
		while ((currentLine = br.readLine()) != null) {
			lines[i] = currentLine; 
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
