import java.util.*;
import java.util.Scanner;
class PalindromeChecker{
    Scanner in = new Scanner(System.in);
       void stringbuilder(){
 System.out.print("ENTER THE INPUT1 :");
    String s =in.nextLine();
            StringBuilder sb = new StringBuilder(s);
        String t =sb.reverse().toString();
        if(s.equalsIgnoreCase(t)){
            System.out.println("IT IS PALINDRIME IN STRINGBUILDER METHED");
        }
        else{
         System.out.println("IT ISN'T PALINDRIME IN STRINGBUILDER METHED");
        }
    }
    void string(){
      System.out.print("ENTER THE INPUT2 :");
      String e =in.nextLine();
        String w ="";
          for (int i = e.length() - 1; i >= 0; i--) {
            w += e.charAt(i);  
        }
        if(e.equalsIgnoreCase(w)){
            System.out.println("IT IS PALINDRIME IN STRING METHED");
        }
        else{
         System.out.println("IT ISN'T PALINDRIME IN STRING METHED");
        }
    }
     void stringbuffer(){
 System.out.print("ENTER THE INPUT3 :");
    String h =in.nextLine();
            StringBuffer bs = new StringBuffer(h);
        String g =bs.reverse().toString();
        if(h.equalsIgnoreCase(g)){
            System.out.println("IT IS PALINDRIME IN STRINGBUFFER METHED");
        }
        else{
         System.out.println("IT ISN'T PALINDRIME IN STRINGBUFFER METHED");
        }
    }
    void without(){
        System.out.print("ENTER THE INPUT4 :");
        String str = in.nextLine();
        int left=0,right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("IT ISN'T PALINDRIME IN WITHOUTSTRING METHED");
                return;
            }
            left++;
            right--;
        }
                System.out.println("IT IS PALINDRIME IN WITHOUTSTRING METHED");
        
    }
}
class PalindromeChecker_UsingStringMethedsAndWithoutString{
    public static void main(String[] args){
        PalindromeChecker obj = new PalindromeChecker();
        obj.stringbuilder();
        obj.string();
        obj.stringbuffer();
        obj.without();
    }
}