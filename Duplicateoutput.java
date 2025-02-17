import java.io.*; 
  
class Duplicateoutput { 
    public static void main(String[] args) 
    { 
        int A[] = { 0,1,1,2,2,3,3,3,2,3,4,4,4,5,6,5,8 }; 
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < A.length; i++) { 
            if (A[i] > max) 
                max = A[i]; 
        } 
        int B[] = new int[max + 1]; 
        for (int i = 0; i < A.length; i++) { 
            B[A[i]]++; 
        } 
        for (int i = 0; i <= max; i++) { 
            if (B[i] >= 0) 
            System.out.print("   ");
                System.out.println(i + "-" + B[i]); 
        } 
    } 
}