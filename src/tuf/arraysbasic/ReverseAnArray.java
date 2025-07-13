package tuf.arraysbasic;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrayReversed = reverseArray(arr);
        for (int i : arrayReversed) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[j] = arr[i];
            j++;
        }
        return reverse;
    }
}
