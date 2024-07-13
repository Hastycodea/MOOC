import java.util.Scanner;

public class Count{
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int input = Integer.valueOf(scanner.nextLine());

	System.out.println();
	for(int i = 1; i <= input; i++) {
		if(i > 1) {
		   System.out.print(",");
		}
		System.out.print(i);	
	}
	
	System.out.println();

	System.out.println("Welcome to Big World!");
    }
}
