
import java.util.Scanner;

public class MathOperations{
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println();
	System.out.print("Enter first integer: ");
	int firstInteger = Integer.valueOf(scanner.nextLine());
	
	System.out.print("Enter second integer: ");
	int secondInteger = Integer.valueOf(scanner.nextLine());

	System.out.println();

	int sum = firstInteger + secondInteger;
	int difference = firstInteger - secondInteger;
	double quotient = (double) firstInteger / secondInteger;
	int remainder = firstInteger % secondInteger;

	System.out.println("Sum: " + sum);
	System.out.println("Difference: " + difference);
	System.out.println("Quotient: " + quotient);
	System.out.println("Remainder: " + remainder);

	System.out.println();
	if(firstInteger % secondInteger == 0) {
	    System.out.println(firstInteger + " is divisible by "+ secondInteger);
	} else {
	    System.out.println(firstInteger + " is not divisible by "+ secondInteger);
	}

	System.out.println();

	// Checking if its odd or even
	if(firstInteger % 2 == 0) {
	    System.out.println(firstInteger + " is even");	
	} else {
	    System.out.println(firstInteger + " is odd");	
	} 

	if(secondInteger % 2 == 0) {
	    System.out.println(secondInteger + " is even");	
	} else {
	    System.out.println(secondInteger + " is odd");	
	}

	System.out.println();

	if(firstInteger > secondInteger) {
	   System.out.println("Comparison: "+ firstInteger+ " is greater than " +secondInteger);
	} else {
	   System.out.println("Comparison: "+ firstInteger+ " is smaller than " +secondInteger);
	}

	if(sum < 10) {
	    System.out.println("The sum of the numbers is small");
	} else if (sum < 101) {
	    System.out.println("The sum of the number is medium");
	} else {
	    System.out.println("The sum of the number is large");
	}

	System.out.println();
	if(quotient > 10) {
	   System.out.println("The quotient is quite large");
	}
    }
}
