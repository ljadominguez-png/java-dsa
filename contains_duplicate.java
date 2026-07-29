
import java.util.HashSet;
import java.util.Set;

public class contains_duplicate {
    public static void main(String [] args){

    }
    public boolean containsDups(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int numbers : nums){
            set.add(numbers);
        }
        if(set.size() < nums.length){
            return true;
        }
        return false;
    }
}
