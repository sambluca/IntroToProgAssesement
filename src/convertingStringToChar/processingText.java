package convertingStringToChar;
import java.util.*;

public class processingText {
	public static char[] alphabet ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public void processingChars(String sentence) throws Exception{
   		System.out.println("");
		userInterface userInterface = new userInterface();
		String userChoice = "Char";
	 	char[] sentenceChar = sentence.toLowerCase().replaceAll(" ", "").toCharArray();
		double alphaLength = processingText.alphabet.length;
		double sentenceLength = sentenceChar.length;
    	System.out.println("|| Letter || Letter Frequency || Relative Frequency ||");
		for(int a = 0; a < alphaLength; a++){
			int letterFrequency = 0 ;
			for(int i = 0; i<sentenceLength; i++){
				if(processingText.alphabet[a]==sentenceChar[i]){
					letterFrequency++;
				}	
			}
		    if(letterFrequency!=0){
		    	double relativeFrequency = (double)(letterFrequency/sentenceLength);
		    	System.out.println("||\t"+ processingText.alphabet[a] + " ||\t\t    " + letterFrequency + " || " + relativeFrequency + " ||");
		    }
		}
		userInterface.afterProcessInterface(userChoice, sentence);
 }
 
	public void processingWords(String sentence) throws Exception{
   		System.out.println("");
		userInterface userInterface = new userInterface();
		String userChoice = "Word";
		String[] wordArray = sentence.split("\\s+");
		String[] wordArray2 = sentence.split("\\s+");
		int mostUsedAmount = 0;
		String mostUsedWord = "";
        for (int i = 0; i < wordArray.length; i += 1) {
            int count = 0;
            
            for (int j = 0; j < wordArray.length; j += 1) {
            	if (wordArray2[j].toLowerCase().equals(wordArray[i].toLowerCase())) {
            		wordArray2[j] = "";
                    count += 1;
                }
            }
            if(count > mostUsedAmount){
            	mostUsedAmount = count;
            	mostUsedWord = wordArray[i];
            }else if(count == mostUsedAmount){
            	
            }
           	if(count != 0){
           		System.out.println(wordArray[i] + ": " + count);
            }

        }
//        System.out.println("Most used word: " + mostUsedWord);
    	userInterface.afterProcessInterface(userChoice, sentence);
    }
 
}

		//average words and stuff like that


