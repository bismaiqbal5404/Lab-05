
package group.lab_05_ex_02;


public class Lab_05_Ex_02 {

    
     public static String reverseWord(String word) {
       
        if (word == null || word.length() <= 1) {
            return word;
        }

        return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
    }

    public static void main(String[] args) {
        
        String[] words = { "World", "Computer", "recursive", "Java", "chair" };

        
        for (String word : words) {
            String reversedWord = reverseWord(word);
            System.out.println("Original: " + word + " | Reversed: " + reversedWord);
        }
    }
}
