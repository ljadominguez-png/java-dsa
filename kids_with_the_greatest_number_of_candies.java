import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kids_with_the_greatest_number_of_candies {
    public static void main(String[] args) {
        int[] test = new int[] { 2, 8, 7 };
        kids_with_the_greatest_number_of_candies solution = new kids_with_the_greatest_number_of_candies();
        System.out.println("answer: " + solution.kidsWithCandies(test, 1));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> truth_table = new ArrayList<>();
        int highest = 0;
        // check first whats the highest
        for (int high : candies) {
            if (high > highest) {
                highest = high;
            }
        }
        for (int candy : candies) {
            // then check if the sum is greater than or equal to the highest
            if (candy + extraCandies >= highest) {
                truth_table.add(true);
            } else {
                truth_table.add(false);
            }
        }

        /*
         * // if we found which has the lowest we update it
         * if (candies[index] < lowest)
         * lowest = candies[index];
         * if (candies[index] == lowest) {
         * truth_table.add(false);
         * } else {
         * truth_table.add(true);
         * }
         */
        // Determining the lowest value

        return truth_table;
    }
}
