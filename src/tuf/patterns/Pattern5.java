package tuf.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
