package tuf.patterns;

public class Pattern20 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            //print left star
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            //print space
            for (int j = 0; j < (n * 2) - (2 * (i + 1)); j++)
                System.out.print(" ");
            //print righ sapce
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            //print left star
            for (int j = 1; j <= (n - 1 - i); j++)
                System.out.print("*");
            //print space
            for (int j = 0; j < 2 * (i + 1); j++)
                System.out.print(" ");
            //print righ sapce
            for (int j = 1; j <= (n - 1 - i); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
