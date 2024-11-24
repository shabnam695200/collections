import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();


        for(int i = 0 ; i<10 ; i++){
            numbers.add(random.nextInt(100));
        }


        System.out.println("reqemler " + numbers);
        Collections.sort(numbers);
        System.out.println( numbers);
    }
}
