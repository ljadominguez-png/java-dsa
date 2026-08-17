import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascals_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = 0;

        System.out.print("Enter number of rows: ");
        rows = in.nextInt();
        in.close();

        pascals_triangle solution = new pascals_triangle();
        List<List<Integer>> ans = solution.generate(rows);
        System.out.print("Output: " + ans);
    }

    // ganto yong expected
    // Input: numRows = 5
    // Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    // another bottom up approach using Dynamic Programming!
    public List<List<Integer>> generate(int numRows) {
        // Todo: Init Triangle List
        List<List<Integer>> Triangle = new ArrayList<>();
        
        // Todo 2 : for the rows
        for (int row = 0; row < numRows; row++) {
            // Todo 3 : holder for the list inside the rows
            List<Integer> rows = new ArrayList<>();

            // Todo 4 : for columns
            for (int col = 0; col <= row; col++) {
                // Todo 5 : if ever we are at the edge either left or right edge
                if (col == 0 || col == row) {
                    rows.add(1);
                } 
                // Todo 6 : Lood at the Previous row in triangle
                else {
                //declaire another list for the previous row
                List<Integer> previousRow = Triangle.get(row-1);
                    rows.add(previousRow.get(col-1) + previousRow.get(col));
                }
               // Triangle.add(rows);  error out of bound
            }
            //dito dapat yan
            Triangle.add(rows);
        }
        return Triangle;
    }
}
/*
 * Pseudo code
 * initialize triangle list [1]
 * 
 * FOR each row r from 0 to numRows - 1:[2]
 * create empty current_row list[3]
 * 
 * FOR each col c from 0 to r: [4]
 * 
 * IF c is at the left edge OR right edge: [5]
 * add 1 to current_row
 * ELSE:
 * look at previous row in triangle[6]
 * add (prev[c - 1] + prev[c]) to current_row
 * 
 * add current_row to triangle
 * 
 * RETURN triangle
 */