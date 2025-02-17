import java.util.Arrays;

public class Numfirstzeronext {
  
    public static void main(String[] args) {
      
        int arr[] = {1,2,0,6,8,4,0,0,8,0,9,3,0,5};
        int n=arr.length;
         for(int i=0;i<n;i++)
        {
            if(arr[i]>=1){
           System.out.print(arr[i]);
        }
        }
       
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0){
           System.out.print(arr[i]);
        }
        }
        System.out.println();
    }
}

