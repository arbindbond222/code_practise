package tuf.patterns;

public class Pattern17 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            char a = 'A';
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j < i)
                    System.out.print(a++);
                else
                    System.out.print(a--);
            }
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
