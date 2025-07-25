package tuf.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
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
