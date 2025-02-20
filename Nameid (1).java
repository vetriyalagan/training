import java.util.Scanner;
class Nameid{
    String name="";
    int id = 7207 ;
    void get(){
        for(int i=1;i<=5;i++){
          Scanner in = new Scanner(System.in);
      System.out.print("NAME : "+name);
        String name = in.nextLine();
          System.out.print("REGISTER ID :"+id);
        int z = in.nextInt();
        }
    }
    public static void main(String[] args){
        Nameid a = new Nameid();
        a.get();
        

    }
}
