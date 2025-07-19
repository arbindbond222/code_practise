package tuf.matchbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisor {
    public static void main(String[] args) {
        System.out.print(workOptSorted(100));
    }

    private static int[] workOptUnSorted(int num) {
        int[] ans = new int[num / 2 + 2];
        // As 1 will be divisor for all
//        we can go till num to find divisor but actually a number is only divisible till half(square root) of the original number after that
//        the digit are just pairs
        int count = 0;
        ans[count++] = 1;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                ans[count++] = i;
                ans[count++] = num / i;
            }
        }
        ans[count++] = num;
        return Arrays.copyOf(ans, count);
    }

    private static int[] workOptSorted(int num) {
        int[] ans = new int[num / 2 + 2];
        // As 1 will be divisor for all
//        we can go till num to find divisor but actually a number is only divisible till half(square root) of the original number after that
//        the digit are just pairs
        int count = 0;
        ans[count++] = 1;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                ans[count++] = i;
                ans[count++] = num / i;
            }
        }
        ans[count++] = num;
        int[] finalAns = Arrays.copyOf(ans, count);
        Arrays.sort(finalAns);
        return finalAns;
    }

    private static int[] work(int num) {
        int[] temp = new int[num];
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                temp[count++] = i;
        }

        return Arrays.copyOf(temp, count); // this create new array with specified size
    }
}
