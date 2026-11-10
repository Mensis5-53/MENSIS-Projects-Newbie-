import java.util.Scanner;

public class Mensis_BMI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Declaration
        double kg, m, bmi;
        int age;
        String name, gender;
        
        //Input & Initial Display
        System.out.println("BMI Calculator");
        System.out.println("=======================");
        System.out.print("Full name: ");
        name = scan.nextLine();
        System.out.print("Gender: ");
        gender = scan.nextLine();
        System.out.print("Age: ");
        age = scan.nextInt();
        System.out.println("-----------------------");
        System.out.print("Weight(Kg): ");
        kg = scan.nextDouble();
        System.out.print("Height(m): ");
        m = scan.nextDouble();
        System.out.println("-----------------------");
        
        //Calculation
        bmi = kg / (m*m);
        
        //Display
        System.out.println("\n-----------------------");
        System.out.print("Full name: " + name);
        System.out.println("\tAge: " + age + " yrs");
        System.out.println("Gender: " + gender);
        System.out.println("-----------------------");
        if (bmi >= 40) {
            System.out.println("Body Mass Index: " + bmi);
            System.out.println("Classification: Obese Class 3");
        } else if (bmi >=35 && bmi < 40) {
            System.out.println("Body Mass Index: " + bmi);
            System.out.println("Classification: Obese Class 2");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Body Mass Index: " + bmi);
            System.out.println("Classification: Obese Class 1");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Body Mass Index: " + bmi);
            System.out.println("Classification: Overweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Body Mass Index: " + bmi);
            System.out.println("Classification: Normal");
        } else if (bmi >= 17 && bmi < 18.5) {
            System.out.println("Body Mass Index: " + bmi);
            System.out.println("Classification: Mild Thinness");
        } else if (bmi >= 16 && bmi < 17) {
            System.out.println("Body Mass Index: " + bmi);
            System.out.println("Classification: Moderate Thinness");
        } else if (bmi < 16) {
            System.out.println("Body Mass Index: " + bmi);
            System.out.println("Classification: Sever Thinness");
        }
        System.out.println("-----------------------");
        
    }
}
