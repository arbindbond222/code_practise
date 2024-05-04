import java.util.HashMap;

/**
 * This class contains a method to check if an array contains any duplicate values.
 *
 * @author Tabnine
 */
public class Duplicate {

    /**
     * This method checks if an array contains any duplicate values.
     *
     * @param nums the input array of integers
     * @return true if the array contains any duplicate values, false otherwise
     */
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int num : nums) {
            if (ans.containsKey(num))
                return true;
            ans.put(num, num);
        }
        return false;
    }
}