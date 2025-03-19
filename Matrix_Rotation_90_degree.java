import java.util.*;

class Matrix_Rotation_90_degree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the rows and columns : ");
        int n = in.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the matrix element at [" + i + "][" + j + "]: ");
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("Entered matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        rotateMatrix(mat, n);

        System.out.println("Matrix after 90 degree rotation:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        in.close();  
    }

    static void rotateMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}
