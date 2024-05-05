import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    //find all triplets in an array so that the sum = 0
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int target = 4;
        findAllTripletsResultingZero(arr);
        System.out.println(findSumClosestToTarget(arr, target));

    }

    private static int findSumClosestToTarget(int[] arr, int target) {
        // we will use two pointer approach that we used in two sum and enhance our logic
        // so that we can fix one element of the array and run two sum in other array
        if (arr == null || arr.length < 3) {
            return 0;
        }
        //because we want to return the element and not indices so we will sort
        Arrays.sort(arr);
        int resultSum = arr[0] + arr[1] + arr[2];
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum==target)
                    return sum;
                else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                // now we need to check what is the difference
                int difference = Math.abs(sum - target);
                if (difference < minDifference) {
                    minDifference = difference;
                    resultSum = sum;
                }
            }
        }
        return resultSum;
    }

    /**
     * Finds all triplets in an array that sum up to zero.
     *
     * @param arr the input array of integers
     * @return a list of lists of integers, where each inner list represents a triplet that sums up to zero
     */
    public static List<List<Integer>> findAllTripletsResultingZero(int[] arr) {
        // we will use two pointer approach that we used in two sum and enhance our logic
        // so that we can fix one element of the array and run two sum in other array
        if (arr == null || arr.length < 3) {
            return new ArrayList<>();
        }
        //because we want to return the element and not indices so we will sort
        Arrays.sort(arr);
        //Hash Set so that we can remove duplicated from our result array
        HashSet<List<Integer>> result = new HashSet<>();

        //fix the first element
        //because we want to go till third last only
        for (int i = 0; i < arr.length - 2; i++) {
            //start two pointer approach
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
