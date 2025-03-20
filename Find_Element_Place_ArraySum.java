/*
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/
import java.util.*;
class Find_Element_Place_ArraySum {
	public static void main(String[] args) {
		List<Integer> tot = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE LENGTH OF ELEMENT: ");
		int n = in.nextInt();

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + i + ": ");
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);

		System.out.println("The candidates are: " + Arrays.toString(nums));

		System.out.print("Enter the target: ");
		int target = in.nextInt();
		int[] result = twoSum(nums, target);
		if (result != null) {
			System.out.println("Numbers: [" + nums[result[0]] + ", " + nums[result[1]] + "]");
			System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
		} else {
			System.out.println("No solution found.");
		}
	}
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}

			map.put(nums[i], i);
		}

		return null;
	}

}