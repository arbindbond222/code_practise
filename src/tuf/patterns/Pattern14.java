package tuf.patterns;

public class Pattern14 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            char a = 'A';
            for (int j = 1; j <= i; j++)
                System.out.print(a++);
            System.out.println();
        }
    }
}
