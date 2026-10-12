import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Math subject grade: ");
        double grade1 = input.nextDouble();
        System.out.print("Science subject grade: ");
        double grade2 = input.nextDouble();
        System.out.print("English subject grade: ");
        double grade3 = input.nextDouble();
        
        double average = (grade1 + grade2 + grade3) / 3;

        //OUTPUT
        System.out.println("\n===STUDENT RESULTS===");
        System.out.println("Student name: " + name);
        System.out.println("Math subject grade: " + grade1);
        System.out.println("Science subject grade: " + grade2);
        System.out.println("English subject grade: " + grade3);
        System.out.println("Overall average grade: " + average);
        if (average >= 75) {
            System.out.println("Remarks: Passed");
        } else {
            System.out.println("Remarks: FAIL");
            System.out.println("\nKindly communicate with your teacher(s) to settle your grade.");
        }
    }
}
