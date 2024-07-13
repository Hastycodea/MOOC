import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
	System.out.println("Hello World!");

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	String input = scanner.nextLine();

	String inputReversed = new StringBuilder(input).reverse().toString();
	
	if(input.equals(inputReversed)) {
	   System.out.println(input + " is a palindrome");
	} else {
	   System.out.println(input + " is not a palindrome");	
	}

    }
}
