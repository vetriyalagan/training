import java.util.HashSet;
import java.util.Scanner;
class Length_of_substring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);  
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLength;  
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                Length_of_substring solution = new Length_of_substring();
                System.out.print("ENTER THE INPUT: ");
        String s = in.nextLine();  
                int result = solution.lengthOfLongestSubstring(s);
                System.out.println("Length of longest substring without repeating characters: " + result);
                in.close();
    }
}
