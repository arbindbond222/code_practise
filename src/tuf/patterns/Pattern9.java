package tuf.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        pattern7(n);
        pattern8(n);

    }

    public static void pattern7(int n) {
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

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * n - 1 - 2 * i; j++)
                System.out.print("*");
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }


}
