import java.util.Scanner;

public class Operations{
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = Integer.valueOf(scanner.nextLine());

	System.out.print("Enter second number: ");
	int secondNumber = Integer.valueOf(scanner.nextLine());

	//double division = 1.0 * firstNumber / secondNumber;

	//System.out.println("Division = "+division);
	//
	//Remainder
	// Modulo operator => %
	// 10 % 3 == 1
	// 12 % 4 == 0
	// 7 % 9 == 2
	// 9 % 7 == ??
	//int modulo = firstNumber % secondNumber;
	//System.out.println("Remainder: " + modulo);
	
	// if (condition) { 
	// code;
	// }

	// = is an assignment operator, == this is equals to 
	if (firstNumber % 2 = 0) {
	    System.out.println(firstNumber + " is even");	
	} else {
	    System.out.println(firstNumber + " is odd");	
	}

    }
}
