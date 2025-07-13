package tuf.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        char a = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(a);
            a++;
            System.out.println();
        }
    }
}
