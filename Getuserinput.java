import java.util.*;
import java.util.Scanner;
class Getuserinput{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
                System.out.println("Enter The Input c :");
        int  c = s.nextInt();
        int[] arr = new int[c];
            System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < c; i++) {
            if (s.hasNextInt()) {
                arr[i] = s.nextInt();
            }
        }
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < c; i++) {
           
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}