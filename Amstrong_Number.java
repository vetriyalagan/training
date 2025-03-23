import java.util.*;

class Amstrong_Number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("ENTER THE INTEGER: ");
		int n = in.nextInt();

		int originalNumber = n;
		int sum = 0;

		int length = String.valueOf(n).length();
		System.out.println("THE LENGTH OF N IS :"+length);
		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, length);
			n /= 10;
		}

		if (sum == originalNumber) {
			System.out.println("THE " + originalNumber + " IS AN ARMSTRONG NUMBER");
		} else {
			System.out.println("THE " + originalNumber + " IS NOT AN ARMSTRONG NUMBER");
		}
		in.close();
	}
}
