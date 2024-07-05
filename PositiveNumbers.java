import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {

        List<Integer> answers = new ArrayList<>();

        Collections.addAll(answers, 1, -56, 8, 10, -78, 9, -34, 89, 33, -66);


        // testing .reduce method in sum
        int sum = answers.stream().reduce(0, (p, v) -> p + v);
        System.out.println("Sum: " + sum);

        answers.stream().forEach(System.out::println);
        System.out.println();

        System.out.print(positive(answers).toString());
        System.out.println();

        //testing sorting
        System.out.println("Testing sorting: ");

        List<String> names = new ArrayList<>();

        Collections.addAll(names, "Kimtai", "Robin", "Kimtai", "Juliani", "Maasai", "Kimtai");

        //testing distinct => a function to print unique values
        names.stream().distinct().forEach(System.out::println);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .filter(n -> n > 0)
                // any can be used
                // .collect(Collectors.toList()); 
                .collect(Collectors.toCollection(ArrayList::new));
        return result;
    }
}
