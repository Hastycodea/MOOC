import java.util.ArrayList;
import java.util.Scanner;

public class HandlingCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            System.out.print("input: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }

        long countNumbers = inputs.stream()
            .mapToInt(n -> Integer.valueOf(n))
            .filter(s -> s % 3 == 0)
            .count();

        double average =inputs.stream()
            .mapToInt(n -> Integer.valueOf(n))
            .average()
            .getAsDouble();

            System.out.println("Divisible by 3 count: " + countNumbers);
            System.out.println("Average: " + average);
    }
}
