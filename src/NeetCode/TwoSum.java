import java.util.HashMap;
import java.util.Map;


/**
 * This class contains a method to find a pair of numbers in an array that sum up to a target value.
 * It uses a HashMap to store the numbers and their indices as keys and values respectively.
 * The method iterates through the array, for each number it calculates the complement (target - current number) and checks if the complement is already in the HashMap.
 * If it is, it prints the indices of the complement and the current number.
 * If not, it adds the current number and its index to the HashMap.
 *
 * @param nums the input array of integers
 * @param target the target sum value
 */
public class TwoSum {

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        findSumPairUsingHashMap(nums, target);
    }

    /**
     * This method finds a pair of numbers in an array that sum up to a target value.
     * It uses a HashMap to store the numbers and their indices as keys and values respectively.
     * The method iterates through the array, for each number it calculates the complement (target - current number) and checks if the complement is already in the HashMap.
     * If it is, it prints the indices of the complement and the current number.
     * If not, it adds the current number and its index to the HashMap.
     *
     * @param nums the input array of integers
     * @param target the target sum value
     */
    private static void findSumPairUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for each can't be used with int it works with Object
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                System.out.printf("%d %d", map.get(compliment), i);
            }
            map.put(nums[i], i);
        }
    }
}