import java.util.*;
public class TwoBigNumberAdding_MethodTwo 
{
    public static void main(String t[])
    {
        Scanner o = new Scanner(System.in);
     System.out.print("input a is: " );   
     String a= o.nextLine();
     System.out.print("input e is: " );  
       String e = o.nextLine();
        //String a="5787787799999999999999999976";
       // String e="4448888884400444";
        int l=a.length()-1;
        int b=e.length()-1;
        StringBuilder w = new StringBuilder();
        int c=0;
        int sum;
        int d1,d2;
       while(l>=0||b>=0||c>0){
           d1=(l>=0) ? a.charAt(l) - '0':0;
            d2=(b>=0) ? e.charAt(b) - '0':0;   
            sum = d1+d2+c;
           c=sum/10;
           w.insert(0,sum%10);
           l--;
           b--;
           
           System.out.println(w);
       }
       System.out.print("sum of big number :"+w.toString());
    }
}