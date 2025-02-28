import java.util.Scanner;

class main {
    public static String getSentenceInput() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter a sentence: ");
        String inputSentence= scanner.nextLine();
        
        scanner.close();
        return inputSentence;
    }
    public static int countWords(String sentence) {
         String[] words = sentence.trim().split("\\s+");
    
    if (sentence.trim().isEmpty()) {
            return 0;
    }
            return words.length;
}
    public static void main(String[] args) {
        String inputSentence= getSentenceInput ();
        int wordCount = countWords(inputSentence);
         
        System.out.println("The sentence has " + wordCount + " words.");
    }
}