import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Declarations
		double number, sum, average;
		int totalNumbers;
		totalNumbers = -1;
		sum = 0;
		
		//Intro/Input
		System.out.println("Automatic Mean Finder");
		System.out.println("============================");
		System.out.println("Enter your numbers one-by-one to begin.");
		System.out.println("(Enter 00 to stop input and start calculation)");
		
		//Calculator
		do {
		number = scan.nextDouble();
		
		sum += number;
		++totalNumbers;
		} while (number != 00);
		average = sum / totalNumbers;
		
		//Display
		System.out.print("You entered " + totalNumbers + " numbers, the average between all of them is " + average);
		
	}
}
