package textProcessingApp;
import java.math.BigDecimal;
import java.util.*;

public class processingText {
	public static char[] characters ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0', ',', '.', '"', '?', '@', '#', '(',')', '\'','\\','!','&','*'};
	
	public void processingChars(String sentence) throws Exception{
   		System.out.println("");
		userInterface userInterface = new userInterface();
		String userChoice = "Char";
	 	char[] sentenceChar = sentence.toLowerCase().replaceAll(" ", "").toCharArray();
		double alphaLength = processingText.characters.length;
		double sentenceLength = sentenceChar.length;
    	System.out.println("==========================================================");
    	System.out.println("     Letter     Letter Frequency     Relative Frequency");
    	System.out.println("==========================================================");
		for(int a = 0; a < alphaLength; a++){
			int letterFrequency = 0 ;
			for(int i = 0; i<sentenceLength; i++){
				if(processingText.characters[a]==sentenceChar[i]){
					letterFrequency++;
				}	
			}
		    if(letterFrequency!=0){
		   		BigDecimal relativeFrequency = new BigDecimal(letterFrequency/sentenceLength);
		   		relativeFrequency = relativeFrequency.setScale(3, BigDecimal.ROUND_HALF_UP);
		    	System.out.println("        " + processingText.characters[a] + "             " + letterFrequency + "                   " + relativeFrequency );
		    }
		}
		userInterface.afterProcessInterface(userChoice, sentence);
 }
 
	public void processingWords(String sentence) throws Exception{
   		System.out.println("");
		userInterface userInterface = new userInterface();
		String userChoice = "Word";
		String[] wordArray = sentence.split("\\s+");
		String[] wordComparisonArray = sentence.split("\\s+");
		int lengthOfWord = 0;
		System.out.println("============================================================");
		System.out.println("     Word Frequency       Length Of Word       Word");
		System.out.println("============================================================");
        for (int i = 0; i < wordArray.length; i += 1) {
            int count = 0;
            
            for (int j = 0; j < wordArray.length; j += 1) {
            	if (wordComparisonArray[j].toLowerCase().equals(wordArray[i].toLowerCase())) {
            		wordComparisonArray[j] = "";
            		lengthOfWord = wordArray[i].length();
                    count += 1;
                }
            }
            
           	if(count != 0){
//           		System.out.println("          " + count + "                      " + lengthOfWord + "               " + wordArray[i]);
           		generateWordTable(wordArray[i], count, lengthOfWord);
            }

        }
    	userInterface.afterProcessInterface(userChoice, sentence);
    }
	
	public void generateWordTable(String word, int count, int lengthOfWord ) throws Exception{
		if(lengthOfWord >= 10) {
			System.out.println("          " + count + "                      " + lengthOfWord + "              " + word);
		} else {
       		System.out.println("          " + count + "                      " + lengthOfWord + "               " + word);
		}
	}
 
}

		//average words and stuff like that


