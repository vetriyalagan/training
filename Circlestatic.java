import java.util.Scanner;
abstract class Circlestatic {
    static double r ;
	static double area;
	static double circum;
	static void get()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE VALUE r :");
		r=in.nextDouble();
	}
	static void Circlearea()
	{
		area = 3.14*r*r;
		System.out.println("Area =" +area);
	}
	static void Areacircumfrance() {
		circum = 2*3.14f*r;
	System.out.println("Circum :" +circum);

	}
	public static void main(String[] args) {
		Circlestatic.get();
		Circlestatic.Circlearea();
		Circlestatic.Areacircumfrance();
	}
}