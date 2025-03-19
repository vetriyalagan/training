import java.util.Scanner;
class Remove_Element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print("ENTER THE ELEMENT " + j +" :");
            nums[j] = in.nextInt();
        }
         System.out.print("ENTER THE VALUE : ");
        int val = in.nextInt();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
                System.out.println("Updated element: ");
        for (int k = 0; k < i; k++) {
            System.out.print(nums[k] + " ");
        }
                System.out.println();
    }
}
