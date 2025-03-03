import java.util.Scanner;

class IdNumber {
    int idnum = 22104001; 
    int n;
    IdNumber(int n) {
        this.n = n;
    }
    String generateId(int i) {
        return "The Student ID " + i + " is: 7207" + idnum;
    }
  
}

class StudentName extends IdNumber {
        StudentName(int n) {
        super(n);
    }

    void displays() {
        for (int i = 1; i <= n; i++) {
            String studentId = generateId(i); 
            if (idnum % 2 == 0) {
                System.out.println(studentId + " is a boy.");
            } else {
                System.out.println(studentId + " is a girl.");
            }
            idnum++; 
        }
    }
}

class StudentIdWithGen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = in.nextInt();

        StudentName obj = new StudentName(n);
        obj.displays();       
        in.close();
    }
}
