import java.util.Arrays;

public class Maxnum {
  
    public static void main(String[] args) {
      
        int arr[] = {125, 132, 95, 116, 110};

       Arrays.sort(arr);
       System.out.print("Enter the first max num:" + arr[arr.length-1]);
        System.out.println();
        System.out.print("Enter the second max num:" + arr[arr.length-2]);
         System.out.println();
         System.out.print("Enter the three max num:" + arr[arr.length-3]);
    }
}