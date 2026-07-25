
import java.util.Arrays;
import java.util.Scanner;

public class maximum_product_of_two_digits {
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);
        String message = "Enter 2 numbers: ",
        results = "The maximum product is: ";
        int input;

        System.out.print(message);
        input = in.nextInt();

        maximum_product_of_two_digits myclass = new maximum_product_of_two_digits();
        int answer = myclass.maxProduct(input);
        System.out.println(results + answer);
        System.out.println("Advance : " + myclass.advance(input));
    }
    //logic to get the maximum product you need to find the 2 largest integers given them multiply it to get the max product

    public int maxProduct (int n){
        //easier approach
        //convert int to str then conver str to array
        String str = String.valueOf(n);
        char[] digits = str.toCharArray();
        //after conversion sort it
        Arrays.sort(digits);
        //highest is always the last index, while second highest is at second to the last index
        // why it has - '0'? because without it java will use the ascii code instead of the number itself
        int max1 = digits[digits.length-1] - '0';
        int max2 = digits[digits.length-2] - '0';

        return max1 * max2;
    }
    public int advance(int n){
        //advance solution
        //n % 10 = gets the last digit
        // n / 10 = removes the last digit
        //assign 2 variables 
        int max1 = 0, max2 = 0;
        while(n>0){
            int digit = n % 10; 
            //check if the last number is greater than max1 if yes then put it
            if(digit > max1){
                max2 = max1;//old highest becomes new highes
                max1 = digit;// new highest
            }else if(digit > max2){
                max2 = digit;
            }

            n /= 10;
        }
        
        return max1 * max2;
    }
}
