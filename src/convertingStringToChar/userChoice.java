package convertingStringToChar;
import java.util.*;

public class userChoice {
	
	
	public static void userInterface() throws Exception{
		String sentence = "";
		
		fileReader fileReader = new fileReader();
		processingText processingText = new processingText();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 1 if you want to enter text to the console or 2 for text to be read from a file");
		String choice = sc.nextLine();
		if(choice.equals("1")){
			System.out.println("Please enter text");
			sentence = sc.nextLine();
			}
		else if(choice.equals("2")){
			System.out.println("Please enter a file name");
			String fileName = sc.nextLine();
			sentence = fileReader.fullText("src/convertingStringToChar/" + fileName + ".txt");
		} else {
			System.out.println("Not a valid option. Please enter a valid option.");
			userChoice.userInterface();
		}
		
		processingText.process(sentence);
	}	
		
	}



