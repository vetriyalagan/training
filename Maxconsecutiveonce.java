import java.util.Arrays;

public class Maxconsecutiveonce {
  
    public static void main(String[] args) {
      
        int arr[] = {1,1,0,1,1,0,0,1,0,1,1,1,0};
        int n=arr.length;
        int maxi =0;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i] ==1){
            count++;
            maxi=Math.max(maxi,count);
            }
        else if(arr[i]==0)
        {
            count=0;
        }
        }
        System.out.println("Max consecutive once:"+maxi);
    }
}