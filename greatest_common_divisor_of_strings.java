import java.util.Scanner;

public class greatest_common_divisor_of_strings {

    public static void main(String[] args){
        String word1, word2;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter word1: ");
        word1 = in.next();
        System.out.print("Enter word2: ");
        word2 = in.next();

        greatest_common_divisor_of_strings solution = new greatest_common_divisor_of_strings();
        System.out.println("common divisor of the strings: " + solution.gcdOfString(word1, word2));

        in.close();
    }
    // if the input is sbsb then the gcd is sb if and only if the string is concatinated
    public String gcdOfString (String string1, String string2){
        StringBuilder word = new StringBuilder();
        int lengt1 = string1.length(), length2 = string2.length();
        int index_of_word1 = 0, index_of_word2 = 0;
        if (!(string1 + string2).equals(string2 + string1)) return "";
        while (index_of_word1 < string1.length() && index_of_word2 < string2.length()){
            if(string1.charAt(index_of_word1) == string2.charAt(index_of_word2)){
                word.append(string1.charAt(index_of_word1));
            }else{
                return "";
            }
                index_of_word1++;
                index_of_word2++;
        }
        //compute the gcd based on the length
        int end = gcd(lengt1, length2);

        return word.substring(0, end).toString();
    }

    private int gcd (int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
