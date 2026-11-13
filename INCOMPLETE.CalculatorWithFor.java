import java.util.Scanner;

public class CalculatorWithFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String oper, loop;
        double num1, num2, result;
        int choice;
        loop = "";

        while (true) {
        System.out.println("=====BASIC CALCULATOR=====\n");
        System.out.println("List of Calculation Options");
        System.out.println("1. Basic Arithmetic Operations");
        System.out.println("2. Comparison Operations");
        System.out.println("3. Mean Calculator");
        System.out.println("4. Sum Calculator");
        System.out.println("---------------------------");
        System.out.print("Enter the number of your choice: ");
        choice = scan.nextInt();

        
        if (choice == 1) {
                System.out.println("\n---Basic Operations Calculator---");
                do {
                System.out.println("\nOperations available:");
                System.out.println("( + | - | x | * | / )");
                System.out.print("Enter the first number to begin: ");
                num1 = scan.nextDouble();
                System.out.print("Operation: ");
                oper = scan.next();
                System.out.print("Next number: ");
                num2 = scan.nextDouble();

                if (oper.equals("+")) {
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                } else if (oper.equals("-")) {
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                } else if (oper.equalsIgnoreCase("x") || oper.equals("*")) {
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                } else if (oper.equals("/")) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("\n<!> UNRECOGNIZED INPUT <!>");
                }
                System.out.println("\nEnter 1 to redo calculation");
                System.out.println("Enter (exit) to return to calculation options");
                loop = scan.next();
                    if (loop.equalsIgnoreCase("exit")) {
                        break;
                    }
                } while (loop.equals("1"));
            }
        if (choice == 2) {
                System.out.println("\n---Comparison Calculator---");
                do 
                System.out.println("\nOperations Available:");
                System.out.println("( < | > | <= | >= | = | != )");
                System.out.println("Enter the first number to begin: ");
                num1 = scan.nextDouble();
                System.out.println("Operation: ");
                oper = scan.next();
                System.out.println("Next number: ");
                num2 = scan.nextDouble();
        }


            
        }
    }
}
