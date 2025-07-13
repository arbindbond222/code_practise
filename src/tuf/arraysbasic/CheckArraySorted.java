package tuf.arraysbasic;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1};
        System.out.println(isSortedusingOneLoop(arr));
    }

    private static boolean isSorted(int[] arr) {
        System.out.println(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSortedusingOneLoop(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
