import java.util.Arrays;

public class Onefirstzeronext {
  
    public static void main(String[] args) {
      
        int arr[] = {1,1,0,0,0,1,1,1,1,0,0,0,1,0,1};
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

