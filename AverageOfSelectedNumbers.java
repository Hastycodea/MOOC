import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            System.out.print("Enter number: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }

        System.out.print("Print avg of positives or negatives? (p,n): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("p")) {
            double positiveAverage = inputs.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .filter(n -> n > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of negative numbers: " + positiveAverage);

        }

        if (choice.equalsIgnoreCase("n")) {
            double negativeAverage = inputs.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .filter(n -> n < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of negative numbers: " + negativeAverage);

        }
    }
}
