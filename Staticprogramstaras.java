import java.util.Scanner;
import java.util.*;
 class Program{
    static int print(){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                System.out.print("# ");
                }
                else{
                    System.out.print("* ");
                }
            }System.out.println();
        } return 0 ;
    }
 }
class Staticprogramstaras{

	public static void main(String[] args) {
	          Program m = new  Program();
	          m.print();
	  }
}
