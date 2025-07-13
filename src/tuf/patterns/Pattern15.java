package tuf.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char a = 'A';
            for (int j = 0; j < n - i; j++)
                System.out.print(a++);
            System.out.println();
        }
    }
}
