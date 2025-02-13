import java.util.Scanner;
class Findoddevenprime{

    
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number:");
       int num = scan.nextInt();
       int evennum = 0;
       int oddnum = 0;
       int count=0;
       int original=num;
       int primenum=0;
       while(num>0)
       {
           int last = num % 10;
           if(last%2==0)
           {
               evennum=evennum*10+last;
           }
           else{
               oddnum =oddnum*10+last;
           }
           num/=10;
       }
        System.out.println("Evennum:"+evennum);
          System.out.println("Oddnum:"+oddnum);
          while(original>0)
          {
              int rem = original%10;
              for(int i=1;i<=rem;i++)
              {
                  if(rem%i==0)
                  {
                      count++;
                  }
              }
              if(count==2)
              {
                  primenum=primenum * 10 + rem;
              }
              count=0;
              original/=10;
          }
          System.out.println("primenum:"+primenum);
     }
}
