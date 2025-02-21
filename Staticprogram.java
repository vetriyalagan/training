import java.util.Scanner;
import java.util.*;
 class Program{
     static int c=1;
      public static int Program()
     {
         c++;
         return c;
     } 
     static int display()
     {
     System.out.println("OBJECT COUNT : " +c);
         return Program();
     }
 }
class Staticprogram{

	public static void main(String[] args) {
	          Program m = new  Program();
	          m.display();
	          
	           Program z = new Program();
	          z.display();   
	           Program x= new Program();
	          x.display();  
	  }
}
