import java.util.Scanner;
import java.util.*;
 class Program{

   static int area()
   {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER R :");
       float pi =3.14f;
     int r = in.nextInt();
     float a = pi*(r*r);
     System.out.print("AREA OF CIRCLE :" +a +"\n\n");
     return 0;
   }
 }
 class Pro{
   static int area(){
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER R :");
       int r = in.nextInt();
     float a = r*r;
     System.out.print("AREA OF SQUARE :" +a+"\n\n" );
     return 0;
   }
 }
 class Pros{
   static int area(){
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER L :");
       int l = in.nextInt();
       System.out.print("ENTER W :");
       int w = in.nextInt();
     float a = l*w;
     System.out.print("AREA OF RECTANGLE :" +a+"\n\n" );
     return 0;
   }
 }
 class Prosc{
   static int area(){
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER B :");
       int b = in.nextInt();
       System.out.print("ENTER H :");
       int h = in.nextInt();
     float a =(b*h)/2;
     System.out.print("AREA OF TRIANGLE :" +a+"\n" );
     return 0;
   }
 }
class Fourareacalculation{

	public static void main(String[] args) {
	          Program m = new  Program();
	          m.area();
	         Pro o = new  Pro();
	          o.area();
	           Pros k = new  Pros();
	          k.area();
	          Prosc ko = new  Prosc();
	          ko.area();
	          
	  }
}
