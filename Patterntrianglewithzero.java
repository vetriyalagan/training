import java.util.*;

public class Patterntrianglewithzero {
    public static void printPattern(int n)
    {
        int i, j, k;

        for (i = 1; i <= n; i++) {
          
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
          
            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print("0");
                }
            }

            System.out.println("");
        }
    }

    public static void main(String args[])
    {
        int n = 5;
        printPattern(n);
    }
}