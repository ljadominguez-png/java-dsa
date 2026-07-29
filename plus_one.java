
import java.util.Arrays;


public class plus_one {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 9};
        int[] arr2 = new int[]{4, 3, 2, 1};
        int[] arr3 = new int[]{1,9,9,9,9};
        plus_one solution = new plus_one();
        System.out.println("result 1" + Arrays.toString(solution.plusOne(arr1)));

        System.out.println("result 2" + Arrays.toString(solution.plusOne(arr2)));

        System.out.println("result 3" + Arrays.toString(solution.plusOne(arr3)));
    }

    public int[] plusOne(int[] digits) {
        //get the last index
        int position_of_last_index = digits.length - 1;
        for (int reader = position_of_last_index; reader >=0; reader--) {
            if (digits[reader] < 9) {
                //if less than nine lang, just +1
                digits[reader] = digits[reader] + 1;
                return digits;
            } else if (digits[reader] == 9) {
                //return zero on the current index
                digits[reader] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
