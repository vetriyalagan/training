import java.util.Scanner;
class Book {
    String bookname;
    float price;
    Book(){
        bookname="java language";
       price =100;
    }
        void display(){
            System.out.println("BOOK NAME :"+bookname);
            System.out.println("BOOK PRICE :"+price);
        
    }
    public static void main(String[] args){
        Book a = new Book();
        a.display();
    }
}
    