import java.util.*;
class Reversed_string {

	static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;

		}
		return new String(charArray);
	}
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("ENTER THE STRING :");
		String input = in.nextLine();
		String reversed = reverseString(input);
		System.out.println("Reversed String: " + reversed);

	}
}
