import java.util.*;

class  Patern {
    
    public static void main(int n)
    {
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("1");
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 5;
        main(n);
    }
}