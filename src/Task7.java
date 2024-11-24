import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(110);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(110);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(110);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);

    }
}
