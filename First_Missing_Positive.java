import java.util.Scanner;
class First_Missing_Positive {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
                for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
                int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        First_Missing_Positive solution = new First_Missing_Positive();
        int result = solution.firstMissingPositive(nums);
                System.out.println("The first missing positive integer is: " + result);
    }
}
