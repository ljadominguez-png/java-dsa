import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascals_triangle_ii {
    
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int rows = 0;

        System.out.print("Enter row index: ");
        rows = in.nextInt();

        pascals_triangle_ii solution = new pascals_triangle_ii();
        List<Integer> answer = solution.getRow(rows);
        System.out.println("Output: " + answer);
        in.close();
    }

    public List<Integer> getRow(int rowIndex) {
        //todo 1 init list
        //int target = rowIndex;
        List<List<Integer>> rows = new ArrayList<>();
        //List<Integer> rowindexes = rows.get(target);
        for(int row = 0; row <= rowIndex; row++){
            List<Integer> rowsin = new ArrayList<>();
            for(int col = 0; col <= row; col++){
                if(col ==0 || col  == row){
                    rowsin.add(1);
                }
                else{
                    List<Integer> previous = rows.get(row -1);
                    rowsin.add(previous.get(col -1) + previous.get(col));
                }

            }
            rows.add(rowsin);
        }
     return rows.get(rowIndex);   
    }
}
