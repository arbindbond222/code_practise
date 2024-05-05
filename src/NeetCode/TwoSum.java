import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * This class contains a method to find a pair of numbers in an array that sum up to a target value.
 * It uses a HashMap to store the numbers and their indices as keys and values respectively.
 * The method iterates through the array, for each number it calculates the complement (target - current number) and checks if the complement is already in the HashMap.
 * If it is, it prints the indices of the complement and the current number.
 * If not, it adds the current number and its index to the HashMap.
 *
 */
public class TwoSum {

    static class PairArray implements Comparable<PairArray> {
        int index;
        int value;

        PairArray(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(PairArray o) {
            return this.value - o.value;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        findSumPairUsingHashMap(nums, target);
        findSumPairUsingPairArray(nums, target);
    }

    private static void findSumPairUsingPairArray(int[] nums, int target) {
        //Here we are creating a new class called as PairClass this is our self made class
        //we will also have comparator
        PairArray[] pairArrays = new PairArray[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pairArrays[i] = new PairArray(i, nums[i]);
        }
        Arrays.sort(pairArrays);
        int[] res = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int sum = pairArrays[left].value + pairArrays[right].value;
            if(sum == target) {
                res[0] = pairArrays[left].index;
                res[1] = pairArrays[right].index;
                break;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        //show result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }


    }

    /**
     * This method finds a pair of numbers in an array that sum up to a target value.
     * It uses a HashMap to store the numbers and their indices as keys and values respectively.
     * The method iterates through the array, for each number it calculates the complement (target - current number) and checks if the complement is already in the HashMap.
     * If it is, it prints the indices of the complement and the current number.
     * If not, it adds the current number and its index to the HashMap.
     *
     * @param nums   the input array of integers
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