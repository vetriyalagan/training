import java.util.*;
public class pattern_Number_pyramid_Value_Decrement{
    public static void printPattern(int n)
    {
        int i, j;
        
        for (i = n; i >= 1; i--) {
            for(j =1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (j = n; j >=i; j--) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
