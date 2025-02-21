import java.util.Scanner;
import java.util.*;
class Main{
    public int a,b,c;
    void Display(){
        System.out.print("SUM c :"+c);
    }
}
public class Add
{
	public static void main(String[] args) {
	                  Main m = new Main();
	   Scanner in = new Scanner(System.in);
	   System.out.print("ENTER a :");
	   m.a=in.nextInt();
	   System.out.print("ENTER b :");
	   m.b=in.nextInt();
	   m.c=m.a+m.b;
              m.Display();
}
}