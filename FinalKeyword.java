import java.util.*;
import java.util.Scanner;
final class Final{
    final int a=1;
    int s;
    final void display()
    {
    for(int i =1;i<=5;i++){
    
        s=a+i;
        
    }
    System.out.print("print the final :"+s);
    }
}
class FinalKeyword{
    public static void main(String[] args){
        Final obj = new Final();
        obj.display();
    }
}