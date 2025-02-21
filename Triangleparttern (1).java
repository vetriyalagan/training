import java.util.Scanner;
import java.util.*;
 class Righttriangle{
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
    void right(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    
 }
class Lefttriangle{
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     void left(){
      for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("  ");
        }
        for(int k=1;k<=i;k++){
        System.out.print("* ");
        }
        for(int x=n+1;x<=i+n;x++){
          System.out.print(" ");
        }
         // for(int y=2*n;y<=(i+(2*n))-1;y++){
         // System.out.print("* ");
      //  }
        System.out.println();
        /* for(int l=n;l>=i-1;l--){
            System.out.print("  ");
         }
        for(int h=1;h<=i;h++){
        System.out.print("* ");
        }
        System.out.println();*/
    }
     }
 }

class Triangleparttern{

	public static void main(String[] args) {
	          Righttriangle m = new  Righttriangle();
	          m.right();
	          
	           Lefttriangle z = new  Lefttriangle();
	          z.left();    
	  }
}
