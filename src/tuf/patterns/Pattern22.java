package tuf.patterns;


public class Pattern22 {
    public static void main(String[] args) {
        printPattern(4);
        // TO get last patter we should subtract n
    }

    private static void printPattern(int n) {
        //
        for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
                int top = i;
                int bottom = (((2*n)-1)-top)-1;
                int left = j;
                int right = (((2*n)-1)-left)-1;
                int min = minimum(top, bottom, left, right);
                System.out.print(n - min);
            }
            System.out.println();
        }
    }

    private static int minimum(int top, int bottom, int left, int right) {
        return Math.min(Math.min(top,bottom),Math.min(left,right));
    }
}
