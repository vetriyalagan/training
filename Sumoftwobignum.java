import java.util.*;
import java.math.*;
public class Sumoftwobignum{
 
     public static void main(String []args){
         Scanner m = new Scanner(System.in);
     System.out.println("input 1 is: " );   
     String x= m.nextLine();
    Scanner s= new Scanner(System.in);
     System.out.println("input 2 is: " );  
       String y = s.nextLine();
        BigInteger a=new BigInteger(x); 
        BigInteger b=new BigInteger(y); 
        
        System.out.println("The Value is:"+a.add(b)); 
         
     }
}