import java.util.Scanner;

public class length_of_the_lastword {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String words = in.nextLine();
        length_of_the_lastword myclass = new length_of_the_lastword();
        System.out.println(myclass.fastSolution(words));
        in.close();
    }
    //O(n)
    public int lengthOfLastWord (String s){
        //split the words
        // using the //W+ = Divide and Strip Punctuation
        String[] huntress = s.trim().split("\\W+");
        return huntress[huntress.length-1].length();
    }
    
    //O(1)
    public int fastSolution (String s){
        int length = 0;
        int lastindex = s.length()-1;
        for(int start = lastindex; start >=0; start--){
            if(s.charAt(start) !=' '){
                length++;
            }else if(length >0){
                return length;
            }
        }
        
        return length;
    }
}
