import java.util.*;
import java.util.Scanner;
class Bookdetails{
    String tittle;
    String author;
    float price;
    Bookdetails(String t,String a,float p){
        tittle=t;
        author=a;
        price=p;
    }
    void display(){
        System.out.println("TITTLE : " + tittle);
                System.out.println("AUTHOR : "+author);
                        System.out.println("PRICE : "+price);
    }
    public static void main(String[] args){
        Bookdetails a = new Bookdetails("java language","jeeva",499);
        a.display();
                Bookdetails b = new Bookdetails("C language","sri",399);
        b.display();

    }
    
}
    