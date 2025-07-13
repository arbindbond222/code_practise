package tuf.arraysbasic;

public class OddCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Count of odd numbers: " + countOdd(arr, n));
    }

    public static int countOdd(int[] arr, int n) {
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }
}
