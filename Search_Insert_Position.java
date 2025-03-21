/*
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/
import java.util.*;
import java.util.Arrays;
import java.util.List;
class Search_Insert_Position {
	public static int index_check(int target, List<Integer> ist) {
		for (int i = 0; i < ist.size(); i++) {
			if (target == ist.get(i)) {
				return i;
			}
		}
		add_element(target, ist);
		return ist.indexOf(target);
	}
	public static void add_element(int target, List<Integer> ist) {
		ist.add(target);
		Collections.sort(ist);
		System.out.println("The list after adding the target and sorting: " + ist);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE LENGTH OF ELEMENT: ");
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + i + ": ");
			nums[i] = in.nextInt();
		}
		List<Integer> ist = new ArrayList<>();
		for (int num : nums) {
			ist.add(num);
		}
		System.out.println("The nums are: " + Arrays.toString(nums));
		System.out.print("Enter the target: ");
		int target = in.nextInt();
		int index = index_check(target, ist);
		System.out.println("The target " + target + " should be inserted at index: " + index);
	}
}
