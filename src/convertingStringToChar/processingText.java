package convertingStringToChar;
import java.util.*;

public class processingText {
	public static char[] alphabet ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	
	public void process(String sentence){
	 processingChars(sentence);
	 processingWords(sentence);
	}
 
	public void processingChars(String sentence){
	 	char[] sentenceChar = sentence.toLowerCase().replaceAll(" ", "").toCharArray();
		double alphaLength = processingText.alphabet.length;
		double sentenceLength = sentenceChar.length;

		for(int a = 0; a < alphaLength; a++){
			int letterFrequency = 0 ;

			for(int i = 0; i<sentenceLength; i++){
				if(processingText.alphabet[a]==sentenceChar[i]){
					letterFrequency++;
				}	
			}
		    if(letterFrequency!=0){
		    	double relativeFrequency = (double)(letterFrequency/sentenceLength);
		    	System.out.print("|"+ processingText.alphabet[a] + ": " + letterFrequency + "|");
		    	System.out.println("|"+relativeFrequency + "|");
		    }
		} 
 }
 
	public void processingWords(String sentence){
		String[] wordArray = sentence.split("\\s+");
		int mostUsedAmount = 0;
		String mostUsedWord = "";
		String[] mostUsedWords = new String[wordArray.length];
        for (int i = 0; i < wordArray.length; i += 1) {
            int count = 0;
            
            for (int j = 0; j < wordArray.length; j += 1) {
            	if (wordArray[j].toLowerCase().equals(wordArray[i].toLowerCase())) {
                    count += 1;
                }

            }

//            System.out.println(wordArray[i] + " " + count);

            if(count > mostUsedAmount){
            	mostUsedAmount = count;
            	mostUsedWord = wordArray[i];
            }else if(count == mostUsedAmount){
            	
            }
            System.out.println(wordArray[i] + " " + count + "  Most used word: " + mostUsedWord);

        }

    }
 
}

		//average words and stuff like that


