package convertingStringToChar;

public class processingText {
	public static char[] alphabet ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	
 public void process(String sentence){
		char[] sentenceChar = sentence.toLowerCase().replaceAll(" ", "").toCharArray();
		double alphaLength = processingText.alphabet.length;
		double sentenceLength = sentenceChar.length;

		for(int a = 0; a < alphaLength; a++){
			double frequency = 0 ;

			for(int i = 0; i<sentenceLength; i++){
				if(processingText.alphabet[a]==sentenceChar[i]){
					frequency++;
				}	
			}
		    if(frequency!=0){
		    	double relativeFrequency = (double)(frequency/sentenceLength);
		    	System.out.print("|"+ processingText.alphabet[a] + ": " + frequency + "|");
		    	System.out.println("|"+relativeFrequency + "|");
		    }
		}
		
	}
}
