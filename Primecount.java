import java.util.Scanner;
class Counteven{

    
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number:");
       int num = scan.nextInt();
       int count = 0;
       int primecount = 0;
       while(num>0)
       {
           int last = num % 10;
           for(int i=1; i<=last; i++)
           {
               if(last % i==0)
               {
                   count++;
               }
           }
           if(count==2){
               primecount+=last;
           }
           count=0;
           num/=10;
       }
       System.out.println("primecount:"+primecount);
       
     }
}
