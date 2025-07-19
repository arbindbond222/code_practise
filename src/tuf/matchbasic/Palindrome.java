package tuf.matchbasic;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print(work(23472));
    }

    private static int reverse(int num) {
        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10; // extract last digit
            reverseNum = reverseNum * 10 + lastDigit; // append last digit
            num = num / 10;
        }
        return reverseNum;
    }

    static boolean work(int n) {
        return n == reverse(n);
    }

}
