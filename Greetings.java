import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println();
	System.out.println();

	System.out.print("What is your name? ");
	String name = scanner.nextLine();

	System.out.println("Hello "+ name +", welcome to our team");
	System.out.println("This is TotoTechEducation");
    }
}
