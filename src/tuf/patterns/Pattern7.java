package tuf.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i + 1; j++)
                System.out.print("*");
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
