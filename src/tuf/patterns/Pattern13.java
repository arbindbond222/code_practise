package tuf.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(p++ + " ");
            System.out.println();
        }
    }
}
