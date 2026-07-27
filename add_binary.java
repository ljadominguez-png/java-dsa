/*Given two binary strings a and b, 
return their sum as a binary string. */
/*Example 1:

Input: a = "11", b = "1"
Output: "100"

Example 2:

Input: a = "1010", b = "1011"
Output: "10101" */

public class add_binary{
    public static void main(String[] args) {
        String a = "11", b = "1", c = "1010", d = "1010";
        add_binary solution = new add_binary();
        System.out.println("Result 1 : " + solution.addBinary(a, b));
        System.out.println("Result 2 : " + solution.addBinary(c, d));
    }
     public String addBinary(String a, String b) {
        //another two pointer approach
        //use string builder for more efficient
        StringBuilder sb = new StringBuilder();
        int carry = 0, lastindexofA = a.length() -1, lastindexofB = b.length() -1;
        while(lastindexofA >=0 || lastindexofB >=0 || carry > 0){
            int sum = carry; //start with the previous carry
            if(lastindexofA >= 0){
                sum += a.charAt(lastindexofA) -'0';
                lastindexofA--;
            }
            if(lastindexofB >= 0){
                sum += b.charAt(lastindexofB)-'0';
                lastindexofB--;
            }
            sb.append(sum % 2); //outputs 0/1
            carry = sum /2;
        }
        
        return sb.reverse().toString();
    }
}

//TIPS : DO NOT FORGET TO ADD CARRY > 0 IN THE WHILE LOOP LOL!
//UNEXPECTED OUTPUT:
/*Result 1 : 00
Result 2 : 0100 */