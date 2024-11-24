import java.util.Deque;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        Deque<String> vezifeler = new LinkedList<>();
        vezifeler.add("vezife 1");
        vezifeler.add("vezife 2");
        vezifeler.add("vezife 3");
        vezifeler.add("vezife 4");
        vezifeler.add("vezife 5");


        System.out.println("umumi vezifeler " + vezifeler);
        while (!vezifeler.isEmpty()){
            if(!vezifeler.isEmpty()){
                System.out.println("ilk vezifeni sil " + vezifeler.pollFirst());

            }
            if(!vezifeler.isEmpty()){
                System.out.println("son vezifeni sil " + vezifeler.pollLast());
            }

        }
    }
}
