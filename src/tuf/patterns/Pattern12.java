package tuf.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int j = 0; j < (n - i) * 2; j++)
                System.out.print(" ");
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
