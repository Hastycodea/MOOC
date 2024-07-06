import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparison {
    public static void main(String[] args) {

        List<String> presidents = new ArrayList<>();

        Collections.addAll(presidents, "Uhuru", "Moi", "Kibaki", "Ruto");

        Collections.sort(presidents);

        System.out.println("Sort: "+presidents.toString());

        Collections.reverse(presidents);

        System.out.println("Reverse sort: "+presidents.toString());

        
    }
}
