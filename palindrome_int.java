import java.util.Scanner;
public class palindrome_int {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int input = 0;

        System.out.print("Enter a number flease:");
        input = in.nextInt();
        palindrome_int checker = new palindrome_int();
        boolean result = checker.isPalindrome(input);
        System.out.println(result);
        in.close();
    }
    // the traditional method
    public boolean isPalindrome(int x){
        String converted = Integer.toString(x);

        String reversed = new StringBuilder(converted).reverse().toString();

        //check if reversed == converted
        if(converted.equalsIgnoreCase(reversed)){
            return true;
        }     
        return false;
    }

    public boolean optimizedPalindrome (int x){
        
        //make condition before running the program
        if (x < 0 || (x % 10 == 0 && x !=0)){
        return false;
        }
       int  reversedHalf = 0;
        while (x > reversedHalf){
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return  x == reversedHalf || x == reversedHalf / 10;
    }
}
