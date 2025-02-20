import java.util.Scanner;
class CarRental {
    String cartype = "";
    int carid;
    float rent;
    int smallcar = 1000;
    int van = 800;
    int suv = 2500;
    void getCar() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter CAR TYPE (smallcar/van/suv): ");
        cartype = in.nextLine(); 
        System.out.print("Enter CAR ID: ");
        carid = in.nextInt(); 
        System.out.println("\nCar Type: " + cartype);
        System.out.println("Car ID: " + carid);
        getRent();
    }
    void getRent() {
        if (cartype.equals("smallcar")) {
            rent = smallcar;
            System.out.println("Rent for smallcar: " + rent);
        } else if (cartype.equals("van")) {
            rent = van;
            System.out.println("Rent for van: " + rent);
        } else if (cartype.equals("suv")) {
            rent = suv;
            System.out.println("Rent for suv: " + rent);
        } else {
            System.out.println("Invalid car type.");
        }
    }
    public static void main(String[] args) {
        CarRental a = new CarRental();
        a.getCar();
    }
}

