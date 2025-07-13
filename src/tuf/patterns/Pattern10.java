package tuf.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        pattern2(n);
        pattern5(n - 1);

    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
