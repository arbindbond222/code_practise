package tuf.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        int start;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
