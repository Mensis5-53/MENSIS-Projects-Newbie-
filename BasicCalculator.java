import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("First number: ");
		double num1 = inp.nextDouble();

		System.out.print("Operation(+ | - | x | / | > | <): ");
		char oper = inp.next().charAt(0);

		System.out.print("Second number: ");
		double num2 = inp.nextDouble();

		double total = 0;
		if (oper == '+') {
			total = num1 + num2;
		} else if (oper == '-') {
			total = num1 - num2;
		} else if (oper == 'x') {
			total = num1 * num2;
		} else if (oper == '/') {
			total = num1 / num2;
			
		} else if (oper == '>') {
			boolean greater = num1 > num2;
			if (greater) {
			System.out.println(num1 + " is greater than " + num2);
			} else {
				System.out.println(num1 + " is not greater than " + num2);
			}
			
		} else if (oper == '<') {
			boolean lessThan = num1 < num2;
			if (lessThan) {
			System.out.println(num1 + " is less than " + num2);
			} else {
				System.out.println(num1 + " is not less than " + num2);
			}
			
		} else {
			System.out.println("\nOperation " + oper + " not recognized.");
		}
		
		if (oper == '+' || oper == '-' || oper == 'x' || oper == '/') {
		System.out.print("\nTotal: " + total);
		}
	}
}
