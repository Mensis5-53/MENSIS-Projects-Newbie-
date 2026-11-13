import java.util.Scanner;

public class CalculatorWithFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Declaration and Initialization
        String oper, loop;
        double num1, num2, result, sum;
        int choice, totalNumbers;
        boolean comparison;
        sum = 0; num1 = 0;
        loop = "";

        //Options/Menu/Introduction
        while (true) {
        System.out.println("===== BASIC CALCULATOR =====\n");
        System.out.println("List of Calculation Options");
        System.out.println("1. Basic Arithmetic Operations");
        System.out.println("2. Comparison Operations");
        System.out.println("3. Mean/Average Calculator");
        System.out.println("4. Sum Calculator");
        System.out.println("---------------------------");
        System.out.print("Enter the number of your choice: ");
        choice = scan.nextInt();

        //Calculator Options
        //OPTION 1: Basic Arithmetic Operations ---------------------------------------
        if (choice == 1) { 
            //Introduction && Inputs
            System.out.println("\n--- Basic Operations Calculator ---");
            do {
            System.out.println("\nOperations available:");
            System.out.println("( + | - | x | * | / )");
            System.out.print("Enter the first number to begin:\t");
            num1 = scan.nextDouble();
            System.out.print("Operation:\t");
            oper = scan.next();
            System.out.print("Next number:\t");
            num2 = scan.nextDouble();

            //CALCULATIONS
            if (oper.equals("+")) {
                result = num1 + num2;
                System.out.printf("Result: %.3f", result);
            } else if (oper.equals("-")) {
                result = num1 - num2;
                System.out.printf("Result: %.3f", result);
            } else if (oper.equalsIgnoreCase("x") || oper.equals("*")) {
                result = num1 * num2;
                System.out.printf("Result: %.3f", result);
            } else if (oper.equals("/")) {
                result = num1 / num2;
                System.out.printf("Result: %.3f" + result);
            } else {
                System.out.println("\n\n<!> UNRECOGNIZED INPUT <!>");
            }

            //Loop
            System.out.println("\n\nEnter 1 to redo calculation");
            System.out.println("Enter (exit) to return to calculation options");
            loop = scan.next();
                if (loop.equalsIgnoreCase("exit")) {
                    break;
                }
            } while (loop.equals("1"));
            
            //OPTION 2: Comparison Operations ---------------------------------------
        } else if (choice == 2) {
            //Introduction && Inputs
            System.out.println("\n--- Comparison Calculator ---");
            do {
            System.out.println("\nOperations Available:");
            System.out.println("( < | > | <= | >= | = | != )");
            System.out.print("Enter the first number to begin: ");
            num1 = scan.nextDouble();
            System.out.print("Operation: ");
            oper = scan.next();
            System.out.print("Next number: ");
            num2 = scan.nextDouble();
            System.out.println();

            //CALCULATIONS
            //Less than
            if (oper.equals("<")) {
                comparison = num1 < num2;
                if (comparison) {
                    System.out.println(num1 + " is less than " + num2);
                } else {
                    System.out.println(num1 + " is NOT less than " + num2);
                }
            //Greater than
            } else if (oper.equals(">")) {
                comparison = num1 > num2;
                if (comparison) {
                    System.out.println(num1 + " is greater than " + num2);
                } else {
                    System.out.println(num1 + " is NOT greater than " + num2);
                } 
            //Less than or equal to
            } else if (oper.equals("<=")) {
                comparison = num1 <= num2;
                if (comparison) {
                    System.out.println(num1 + " is less than or equal to " + num2);
                } else {
                    System.out.println(num1 + " is NOT less than nor equal to " + num2);
                } 
            //Greater than or equal to
            } else if (oper.equals(">=")) {
                comparison = num1 >= num2;
                if (comparison) {
                    System.out.println(num1 + " is greater than or equal to " + num2);
                } else {
                    System.out.println(num1 + " is NOT greater than nor equal to " + num2);
            } 
            //Equal to
            } else if (oper.equals("=")) {
                comparison = num1 == num2;
                if (comparison) {
                    System.out.println("The statement is true");
                    System.out.println(num1 + " is equal to " + num2);
                } else {
                    System.out.println("The statement is false");
                    System.out.println(num1 + " is NOT equal to " + num2);
                } 
            //Not equal to
            } else if (oper.equals("!=")) {
                comparison = num1 != num2;
                if (comparison) {
                    System.out.println("The statement is true");
                    System.out.println(num1 + " is not equal to " + num2);
                } else {
                    System.out.println("The statement is false");
                    System.out.println(num1 + " is EQUAL to " + num2);
                } 
            } else {
                System.out.println("<!> UNRECOGNIZED INPUT <!>");
            }

            //Loop
            System.out.println("\nEnter 1 to redo calculation");
            System.out.println("Enter (exit) to return to calculation options");
            loop = scan.next();
                if (loop.equalsIgnoreCase("exit")) {
                    break;
                }
            } while (loop.equals("1"));

            //OPTION 3: Mean/Average Calculator ---------------------------------------
        } else if (choice == 3) {
            //Introduction && Inputs
            System.out.println("\n--- Mean/Average Calculator ---");
            do {
            num1 = 1; sum = 0;
            System.out.println("\nQ:\tHow to operate?");
            System.out.println("A:\tEnter the values ONE-BY-ONE then enter (0) to start the calculation process. ");
            System.out.println("You may now begin entering values below");

            //Calculations
            for (totalNumbers = 0; num1 != 0; totalNumbers++) {
            System.out.print("Enter number: ");
            num1 = scan.nextDouble();
            if (num1 == 0) {
                break;
            }
            sum += num1;
            }
            result = sum / totalNumbers;
            System.out.printf("\nThe average is %.3f", result);
            System.out.println("\nYou entered " + totalNumbers + " numbers");

            //Loop
            System.out.println("\nEnter 1 to redo calculation");
            System.out.println("Enter (exit) to return to calculation options");
            loop = scan.next();
                if (loop.equalsIgnoreCase("exit")) {
                    break;
                }
            } while (loop.equals("1"));

        //OPTION 4: Sum Calculator ---------------------------------------
        } else if (choice == 4) {
            //Introduction && Inputs
            System.out.println("--- Sum Calculator ---");
            do {
            num1 = 1;
            System.out.println("\nQ:\tHow to operate?");
            System.out.println("A:\tEnter the values ONE-BY-ONE then enter (0) to start the calculation process. ");
            System.out.println("You may now begin entering values below");

            //Calculations
            for (sum = 0; num1 != 0; sum += num1) {
            System.out.print("Enter number: ");
            num1 = scan.nextDouble();
            }
            System.out.printf("\nThe sum is %.3f", sum);

            //Loop
            System.out.println("\n\nEnter 1 to redo calculation");
            System.out.println("Enter (exit) to return to calculation options");
            loop = scan.next();
                if (loop.equalsIgnoreCase("exit")) {
                    break;
                }
            } while (loop.equals("1"));

            //OPTION NULL: Unknown Input ---------------------------------------
        } else {
            System.out.println("Option " + choice + " is not recognized.");
            System.out.println("Returning to options\n");
            loop = "exit";
        }
            
        }
    }
}
