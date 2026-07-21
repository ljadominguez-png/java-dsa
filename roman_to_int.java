import java.util.HashMap;
import java.util.Scanner;
public class roman_to_int {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";

        System.out.print("Enter a roman number: ");
        input = in.nextLine();

        roman_to_int myclass = new roman_to_int();
        int result = myclass.converter1(input);
        System.out.printf("\nThe Integer value of %s : %d" , input, result);
        in.close();
    }

    public int converter1 (String s){
        s = s.toUpperCase();
        char [] converted_input = s.toCharArray();
        int values = 0;// will be used to add 

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('N', 1000);

        //Next is to add it for example input = II then it should be I + I = 2
        for (int i = 0; i < converted_input.length -1 ; i++) {
            //current value
            int value = map.get(converted_input[i]);
            //next value
            int nextvalue = map.get(converted_input [i+1]);
            
            if(value < nextvalue){
                values -= value;
            }else{
                values += value;
            }

        }  
        int lastIndex = converted_input.length -1;
        values += map.get(converted_input[lastIndex]);
        return values;
    }
}
