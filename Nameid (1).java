import java.util.Scanner;
class Nameid{
    String name="";
    int id;
    void get(){
        for(int i=1;i<=5;i++){
          Scanner in = new Scanner(System.in);
      System.out.print("enter NAME : ");
        String name = in.nextLine();
          System.out.print("enter REGISTER ID :");
        int id = in.nextInt();
        System.out.println("NAME : " + name);
        System.out.println("REGISTER ID : " +id);
        } 
    }
    public static void main(String[] args){
        Nameid a = new Nameid();
        a.get();
        

    }
}
