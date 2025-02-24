import java.util.*;

abstract class Abstract{
   static final int a = get_a();
   public static int get_a(){
       return 900;
   }
   static void display(){
       System.out.println("value : " +a);
   }
}
class Displayreturn{
    public static void main(String[] args){
Abstract.display();
}
}