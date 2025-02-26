interface A{
    static void display(){
        System.out.println("static ");
    }
    default void show(){
        System.out.println("default");
    }
    void view();
}
interface B{
    static void display(){
        System.out.println("static displayed ");
    }
    default void show(){
        System.out.println("default displayed");
    }
    void view();
}

class TwoInterfaceWithSameMetheds implements A,B
{
     public void show() {
          A.super.show();
     }
 public void view(){
        System.out.println("view ");
    }
    public static void main(String[] args){
    A.display();
    B.display();
    
    TwoInterfaceWithSameMetheds o = new TwoInterfaceWithSameMetheds();
    o.show();
    o.view();
    }
}