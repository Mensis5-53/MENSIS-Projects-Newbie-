import java.util.Scanner;

public class Switcheroo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Declaration
        String choice;
        double amt, result;
        int loop;
        loop = 0;
        
        //Display & Input
        do {
        System.out.println("============================");
        System.out.println("PESO Exchange Calculator");
        System.out.println("============================");
        System.out.println("Conversion Options");
        System.out.println("[D]ollar");
        System.out.println("[W]on");
        System.out.println("[E]uro");
        System.out.println("[Y]en");
        System.out.println("----------------------------");
        System.out.print("Enter PESO amount: ");
        amt = scan.nextDouble();
        System.out.print("Enter selected currency: ");
        choice = scan.next();
        System.out.println();
        
        //Calculations & Display
        switch (choice) {
            case "D":
            case "d":
                result = amt * 0.016;
                System.out.println(amt + " Php is worth " + result + " USD");
                break;
            case "W":
            case "w":
                result = amt * 21.24;
                System.out.println(amt + " Php is worth " + result + " South Korean Won");
                break;
            case "E":
            case "e":
                result = amt * 0.014;
                System.out.println(amt + " Php is worth " + result + " Euro");
                break;
            case "Y":
            case "y":
                result = amt * 2.51;
                System.out.println(amt + " Php is worth " + result + " Japanese Yen");
                break;
            default:
                System.out.println("Unknown Currency Identified");
                break;
        }
        //Loop
        System.out.println("\nEnter 1 to repeat conversion");
        loop = scan.nextInt();
        } while (loop == 1);
    }
}
