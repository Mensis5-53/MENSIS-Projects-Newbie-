import java.util.Scanner;

class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT
        System.out.print("Employee name: ");
        String name = input.nextLine();
        System.out.print("Hours worked (This week): ");
        double hoursWorked = input.nextDouble();
        System.out.print("Hourly rate: ");
        double hourly = input.nextDouble();

        //OUTPUT
        System.out.println("\n===SALARY DETAILS===");
        System.out.println("Employee: " + name);
        System.out.println("Hours worked this week: " + hoursWorked + " hours");

        //IF OVERTIME
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            double regularPay = hourly * 40;
            
            System.out.println("Regular hours: 40 hours");
            System.out.println("Overtime hours: " + overtimeHours + " hours");
            System.out.println("\nRegular pay: " + regularPay + "Php");
            System.out.println("Overtime pay: " + (overtimeHours * 150) + "Php");

            double totalPay = regularPay + (overtimeHours * 150);
            System.out.println("Total pay: " + totalPay + "Php");
        } else {
            //ELSE REGULAR
            double regularPay2 = hourly * hoursWorked;
            System.out.println("Regular hours: " + hoursWorked + " hours");
            System.out.println("Regular pay: " + regularPay2 + "Php");
        }
    }
}
