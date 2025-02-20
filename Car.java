import java.util.*;
import java.util.Scanner;
class Car {
    String brand;
    Car(){
     brand = " unknown";
     System.out.println("THE CAR BRAND IS :" + brand);
     
    }
        void display(){
            Scanner f = new Scanner(System.in);
            System.out.print("ENTER THE BRAND NAME : ");
           String model = f.nextLine();
            System.out.println("THE BRAND NAME :"+model);
        
    }
    public static void main(String[] args){
        Car a = new Car();
        a.display();
    }
}
    