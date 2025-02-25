interface Classs{
    static int a = 10;
    static void display(){
        System.out.println("a IS :" +a);
    }
    default void show(){
        System.out.print("default");
    }
}
 class And implements Classs{
     public static void main(String[] args){
         And obj = new And();
         Classs.display();
         obj.show();
     }
 } 
