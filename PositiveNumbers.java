import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {

        List<Integer> answers = new ArrayList<>();

        Collections.addAll(answers, 1, -56, 8, 10, -78, 9, -34, 89, 33, -66);

        System.out.print(positive(answers).toString());

    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .filter(n -> n > 0)
                // .collect(Collectors.toList()); 
                .collect(Collectors.toCollection(ArrayList::new));
        return result;
    }
}
