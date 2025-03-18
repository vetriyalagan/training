import java.util.*;
class Main {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length(); 
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1))
            return false;
        }
        return true;
    }
}
class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE INPUT: ");
        int x = in.nextInt();
        Main obj = new Main();
        boolean result = obj.isPalindrome(x);
        if (result) {
            System.out.println(" true");
        } else {
            System.out.println( "false");
        }
    }
}
