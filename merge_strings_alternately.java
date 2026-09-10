import java.util.Scanner;

public class merge_strings_alternately {

    public static void main(String[] args) {
        String word1, word2;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word: ");
        word1 = in.next();

        System.out.println("Enter a word again: ");
        word2 = in.next();

        merge_strings_alternately solution = new merge_strings_alternately();

        System.out.println("output: " + solution.mergeAlternately(word1, word2));

        in.close();
    }

    public String mergeAlternately(String word1, String word2) {
        // use string builder instead
        StringBuilder words = new StringBuilder();
        /*
         * String[] words = new String[] { word1, word2 };
         * int total = word1.length() + word2.length();
         */
        int index_for_word1 = 0;
        int index_for_word2 = 0;

        while (index_for_word1 < word1.length() || index_for_word2 < word2.length()) {

            if(index_for_word1 < word1.length()){
                words.append(word1.charAt(index_for_word1));
                index_for_word1++;
            }
            if(index_for_word2 < word2.length()){
                words.append(word2.charAt(index_for_word2));
                index_for_word2++;
            }
        }
        return words.toString();
    }

}
