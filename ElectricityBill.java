import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUTS
        System.out.print("Customer name: ");
        String name = input.nextLine();
        System.out.print("Electricity consumption (in kWh): ");
        double consumption = input.nextDouble();
        int rate = 12;
        
        double eBill = consumption * rate;

        //OUTPUTS
        System.out.println("\n===ELECTRICITY BILL===");
        System.out.println("Customer: " + name);
        System.out.println("Electricity consumption: " + consumption + " kWh");
        System.out.println("Rate per kWh: 12Php");
        System.out.println("Total bill: " + eBill + "Php");
        if (eBill >= 2000) {
            double eBillDiscounted = eBill * 0.95;
            System.out.println("Discount: 5%");
            System.out.println("Discounted bill: " + eBillDiscounted + "Php");
        } else {
            System.out.println("(DISCOUNT NOT AVAILED, QUALIFICATION REQUIRES 2000Php OR MORE)");
        }
    }
}
