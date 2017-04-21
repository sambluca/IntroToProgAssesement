package convertingStringToChar;
import java.util.*;

public class userInterface {
	
	public static void enterTextInterface() throws Exception{
		String sentence = "";
		
		fileReader fileReader = new fileReader();		
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
			userInterface.enterTextInterface();
		}
		userChoosesProcessInterface(sentence);
	}
	
	public static void userChoosesProcessInterface(String sentence) throws Exception {
		Scanner sc = new Scanner(System.in);
		processingText processingText = new processingText();
		System.out.println("Please enter 1 if you want to process the Characters of the text or 2 to process the words of the text");
		String choice = sc.nextLine();
		if(choice.equals("1")){
			processingText.processingChars(sentence);
			}
		else if(choice.equals("2")){
			processingText.processingWords(sentence);
		} else {
			System.out.println("Not a valid option. Please enter a valid option.");
			userInterface.userChoosesProcessInterface(sentence);
		}

	}
	
	public static void afterProcessInterface(String userLastProcess, String sentence) throws Exception {
		Scanner sc = new Scanner(System.in);
		processingText processingText = new processingText();
		String choice = "";
		if(userLastProcess.equals("Char")){
			System.out.println("Please enter 1 if you want to process the words of the text or press 2 to start with new text");
			System.out.println("Enter 3 if you want to close the program.");
			choice = sc.nextLine();
			if(choice.equals("1")){
				processingText.processingWords(sentence);
			} else if(choice.equals("2")){
				userInterface.enterTextInterface();
			} else if(choice.equals("3")) {
				System.out.println("Thank you for using this text processing app.");
				System.exit(0);
			} else {
				System.out.println("Not a valid option. Please enter a valid option.");
				userInterface.afterProcessInterface(userLastProcess, sentence);
			}
		} else {
			System.out.println("Please enter 1 if you want to process the characters of the text or press 2 to start with new text");
			System.out.println("Enter 3 if you want to close the program.");
			choice = sc.nextLine();
			if(choice.equals("1")){
				processingText.processingChars(sentence);
			} else if(choice.equals("2")){
				userInterface.enterTextInterface();
			} else if(choice.equals("3")) {
				System.out.println("Thank you for using this text processing app.");
				System.exit(0);
			} else {
				System.out.println("Not a valid option. Please enter a valid option.");
				userInterface.afterProcessInterface(userLastProcess, sentence);
			}

		}
	}
	}



