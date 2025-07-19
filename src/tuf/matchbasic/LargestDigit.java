package tuf.matchbasic;

public class LargestDigit {
    public static void main(String[] args) {
        System.out.print(work(23472));
    }

    private static int work(int num) {
        int max = 0;
        while (num > 0) {
            int lastDigit = num % 10; // extract last digit
            if (lastDigit > max) max = lastDigit;
            num = num / 10;
        }
        return max;
    }
}
