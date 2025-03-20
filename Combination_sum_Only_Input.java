/*
Example 1:
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Example 2:
Input: candidates = [2,5,2,1,2], target = 5
Output:
[
[1,2,2],
[5]
]
*/
import java.util.*;
class Combination_sum_Only_Input {
	static List<List<Integer>> result = new ArrayList<>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE LENGTH OF ELEMENT :");
		int n= in.nextInt();

		int[] candidates =new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("enter elements "+i+" :");
			candidates[i]=in.nextInt();
		}
		System.out.println("the string is :"+Arrays.toString(candidates));
		Arrays.sort(candidates);
		System.out.println("the string is :"+Arrays.toString(candidates));
		System.out.print("enter the target :" );
		int target = in.nextInt();

		findCombinations(candidates, target, 0, new ArrayList<>());
		System.out.println("The combinations are: " + result);
	}

	public static void findCombinations(int[] candidates, int target, int start, List<Integer> current) {
		if (target == 0) {
			result.add(new ArrayList<>(current));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if (i > start && candidates[i] == candidates[i - 1]) {
				continue;
			}
			if (candidates[i] <= target) {
				current.add(candidates[i]);
				findCombinations(candidates, target - candidates[i], i + 1, current);
				current.remove(current.size() - 1);
			} else {
				break;
			}
		}
	}

}






