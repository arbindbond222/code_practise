package tuf.matchbasic;

public class CountDigit {
    public static void main(String[] args) {
        System.out.print(work(2347234729472943724L));
    }

    private static Long work(Long num) {
        Long count = 0L;
        if (num == 0) return ++count;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
