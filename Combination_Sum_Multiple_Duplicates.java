/*
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
Input: candidates = [2], target = 1
Output: []
*/
import java.util.*;

class Combination_Sum_Multiple_Duplicates {
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ELEMENT: ");
        int n = in.nextInt();

        int[] candidates = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            candidates[i] = in.nextInt();
        }
        System.out.println("The candidates are: " + Arrays.toString(candidates));

        System.out.print("Enter the target: ");
        int target = in.nextInt();
        combinationSum(candidates, target, 0, new ArrayList<>());
        System.out.println("The output: " + result);
    }
    public static void combinationSum(int[] candidates, int target, int start, List<Integer> current) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, current);
                current.remove(current.size() - 1); 
            }
        }
    }
}
