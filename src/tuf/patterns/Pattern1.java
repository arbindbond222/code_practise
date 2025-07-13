package tuf.patterns;

public class Pattern1 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
