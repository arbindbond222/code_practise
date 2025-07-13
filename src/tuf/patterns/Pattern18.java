package tuf.patterns;

public class Pattern18 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            char c = (char) (ch + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();

        }
    }
}
