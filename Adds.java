import java.util.Scanner;
import java.util.*;
class Main{
    public int a,b,c;
    public void get(){
        Scanner in = new Scanner(System.in);
         System.out.print("ENTER a :");
	   a=in.nextInt();
	   System.out.print("ENTER b :");
	   b=in.nextInt();
	   c=a+b;
    }
    void Display(){
        System.out.print("SUM c :"+c);
    }
}
public class Adds
{
	public static void main(String[] args) {
	                  Main m = new Main();
	  
              m.get();
              m.Display();
}
}