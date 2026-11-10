import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Declaration
		int loop;
		double Origin_Temp, Conv_Temp;
		String Temp_Scale, Choice;
		Conv_Temp = 0;
		loop = 0;
		
		do {
		//Inputs
		System.out.println("Temperature unit converter.\n");
		System.out.print("Original temperature VALUE: ");
		Origin_Temp = scan.nextDouble();
		System.out.print("Original temperature UNIT(C, K, F): ");
		Temp_Scale = scan.next();
		System.out.println("\n=================");
		System.out.println("Choose converted value");
		System.out.println("[C]elcius");
		System.out.println("[K]elvin");
		System.out.println("[F]ahrenheit");
		System.out.println("=================");
		System.out.print("Convert into: ");
		Choice = scan.next();
		
		//Calculation(Celcius branches)
		if (Temp_Scale.equalsIgnoreCase("C") && Choice.equalsIgnoreCase("F")) {
			Conv_Temp = (Origin_Temp * 1.8) + 32;
			System.out.println();
			System.out.println(Origin_Temp + Temp_Scale + " is equal to " + Conv_Temp + Choice);
		} else
		if (Temp_Scale.equalsIgnoreCase("C") && Choice.equalsIgnoreCase("K")) {
			Conv_Temp = Origin_Temp + 273.15;
			System.out.println();
			System.out.println(Origin_Temp + Temp_Scale + " is equal to " + Conv_Temp + Choice);
		} else
		
		//Fahrenheit branches
		if (Temp_Scale.equalsIgnoreCase("F") && Choice.equalsIgnoreCase("C")) {
			Conv_Temp = (Origin_Temp - 32) * (5/9);
			System.out.println();
			System.out.println(Origin_Temp + Temp_Scale + " is equal to " + Conv_Temp + Choice);
		} else
		if (Temp_Scale.equalsIgnoreCase("F") && Choice.equalsIgnoreCase("K")) {
			Conv_Temp = ((Origin_Temp - 32) * (5/9)) + 273.15;
			System.out.println();
			System.out.println(Origin_Temp + Temp_Scale + " is equal to " + Conv_Temp + Choice);
		} else
		
		//Kelvin branches
		if (Temp_Scale.equalsIgnoreCase("K") && Choice.equalsIgnoreCase("C")) {
			Conv_Temp = Origin_Temp - 273.15;
			System.out.println();
			System.out.println(Origin_Temp + Temp_Scale + " is equal to " + Conv_Temp + Choice);
		} else
		if (Temp_Scale.equalsIgnoreCase("K") && Choice.equalsIgnoreCase("F")) {
			Conv_Temp = ((Origin_Temp - 273.15) * 1.8) + 32;
			System.out.println();
			System.out.println(Origin_Temp + Temp_Scale + " is equal to " + Conv_Temp + Choice);
		}
		
		//Misinput
		else {
			System.out.println("\nUnrecognized input detected");
		}
		System.out.println("Enter 1 to restart calculator. Otherwise, ignore or enter another number.");
			loop = scan.nextInt();
		} while (loop==1);
	}
}
