import java.util.Scanner;
class Nameid{
    String name="";
    int id = 7207 ;
  //  Scanner q = new Scanner(System.in);
      //System.out.print("NAME :" +name);
        //String name = q.nextLine();
          //System.out.print("REGISTER ID :"+id);
        //int id = q.nextInt();
    void get(){
         //String name = n;
        for(int i=1;i<=5;i++){
          Scanner in = new Scanner(System.in);
      System.out.print("NAME : "+name);
        String name = in.nextLine();
          System.out.print("REGISTER ID :"+id);
        int z = in.nextInt();
        }
     //   String name = n;
       // int id = i;
       // System.out.println("NAME :" +n);
        //System.out.println("REGISTER ID :"+i);
    }
    public static void main(String[] args){
        Nameid a = new Nameid();
        a.get();
        

    }
}