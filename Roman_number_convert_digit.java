import java.util.Map;
import java.util.HashMap;
import java.util.*;
class Roman_number_convert_digit {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            if (i == s.length() - 1) {
                ans += roman.get(s.charAt(i));
                return ans;
            }
            int curr = roman.get(s.charAt(i));
            int next = roman.get(s.charAt(i + 1));
            if (curr >= next) {
                ans += curr;                           //EXAMPLE :
                i++;                                  //III-3
            }                                        //LVIII-58
            else {                                  //MCMXCIV-1994
                ans += next - curr;
                i += 2;  
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Roman_number_convert_digit solution = new Roman_number_convert_digit();
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE ROMAN NUMBER :");
        String romanNumeral = in.nextLine();
        int result = solution.romanToInt(romanNumeral);
        
        System.out.println("The Roman numeral " + romanNumeral + " equals " + result);
    }
}
