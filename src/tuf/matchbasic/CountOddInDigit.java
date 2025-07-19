package tuf.matchbasic;

public class CountOddInDigit {
    public static void main(String[] args) {
        System.out.print(work(23472));
    }

    private static int work(int num) {
        int count = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) count++;
            num = num / 10;
        }
        return count;
    }
}
