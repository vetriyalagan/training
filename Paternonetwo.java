import java.util.*;

class  Paternonetwo {
    
    public static void main(int n)
    {
          Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number:");
       int s = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s+"");
                s++;
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