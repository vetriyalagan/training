import java.util.*;
import java.util.Scanner;
class Counter{
    static int counter =0;
    Counter(){
        counter++;
    }
    void display(){
        System.out.print("\nobiected created ? counter increment : " + counter);
    }
     public static void main(String[] args){
        Counter a = new Counter();
        a.display();
         Counter ab = new Counter();
        ab.display();
         Counter ac = new Counter();
        ac.display();
    }
}
    