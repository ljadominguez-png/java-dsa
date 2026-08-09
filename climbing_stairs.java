
import java.util.Scanner;

public class climbing_stairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter number of steps: ");
        number = input.nextInt();

        input.close();

        //solution
        climbing_stairs solution = new climbing_stairs();
        System.out.println("Total number of step needed: " + solution.climbingStairs(number));
    }
    // n represents number of steps
    // recursion does work but it is forbidden due to the TLE constraints
    // a poposed solution is Tabulation (aka bottom up)
    public int climbingStairs (int n){
        //place holder
         int[] ways = new int[n+1];
        // in fibonacci sequence it always starts with 1,1,2,3,5,8...
         ways[0] = ways[1] = 1; 
         //why 2? because of this ways[index-1] + ways[index-2] 
         // index cannot be negative it will throw an out of bound
         for(int index = 2; index <= n; index++){
            ways[index] = ways[index-1] + ways[index-2];//previous step + previous previous step
         }
        return ways[n];
    }
}
