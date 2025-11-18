package CIE;
import java.util.Scanner;

public class Student {
    protected String usn;
    protected String name;
    protected int sem;

    public void inputStudentDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = s.nextLine();
        System.out.print("Enter Name: ");
        name = s.nextLine();
        System.out.print("Enter Semester: ");
        sem = s.nextInt();
    }

    public void displayStudentDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}

package CIE;
import java.util.Scanner;

public class Internals extends Student {
    protected int marks[] = new int[5];

    public void inputCIEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter CIE marks for 5 subjects: ");
        for(int i = 0; i < 5; i++) {
            System.out.print("CIE Mark " + (i+1) + ": ");
            marks[i] = s.nextInt();
        }
    }
}



package SEE;
import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {
    protected int seeMarks[];
    protected int finalMarks[];

    public Externals() {
        seeMarks = new int[5];
        finalMarks = new int[5];
    }

    public void inputSEEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter SEE marks for 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("SEE Mark " + (i + 1) + ": ");
            seeMarks[i] = s.nextInt();
        }
    }

    public void calculateFinalMarks() {
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = (marks[i]) + (seeMarks[i] / 2);
        }
    }

    public void displayFinalMarks() {
        displayStudentDetails();
        System.out.println("Final Marks (CIE + SEE/2): ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i+1) + ": " + finalMarks[i]);
        }
    }
}



import SEE.Externals;

class Main {
    public static void main(String args[]) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = s.nextInt();

        Externals[] st = new Externals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i+1) + " ---");
            st[i] = new Externals();
            st[i].inputStudentDetails();
            st[i].inputCIEmarks();
            st[i].inputSEEmarks();
            st[i].calculateFinalMarks();
        }

        System.out.println("\n===== FINAL MARKS REPORT =====");
        for (int i = 0; i < n; i++) {
            st[i].displayFinalMarks();
        }
    }
}
