import java.util.*;

class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("ENTER THE A VALUE (rows): ");
        int a = in.nextInt();
        System.out.print("ENTER THE B VALUE (columns): ");
        int b = in.nextInt();
        
        int[][] mat = new int[a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("ENTER THE MATRIX [" + i + "][" + j + "]: ");
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("ENTERED MATRIX IS:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();  
        }

        swapSpiralOrder(mat, a, b);
    }
    static void swapSpiralOrder(int[][] mat, int a, int b) {
        int top = 0, bottom = a - 1, left = 0, right = b - 1;
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}
