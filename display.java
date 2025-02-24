import java.util.*;
class Aa{
    final class Bb{
        static void display(){
            System.out.println("displayed");
        }
    }
}
class display{
    public static void main(String[] args){
        Aa.Bb.display();
    }
}