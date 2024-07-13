import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println();

	System.out.print("Enter a string to reverse: ");
	String input = scanner.nextLine();

	String reversedInput = new StringBuilder(input).reverse().toString();
	System.out.println("The reversed string is: "+reversedInput);
    }
}
