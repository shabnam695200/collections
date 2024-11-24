import java.util.Deque;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {

        Deque<String> bookQueue = new LinkedList<>();

        bookQueue.addFirst("kitab 1 ");
        bookQueue.addLast("kitab2");
        bookQueue.addFirst("kitab3");
        bookQueue.addLast("kitab4");

        String removedFirst = bookQueue.pollFirst();
        String removedLast = bookQueue.pollLast();


        System.out.println("ilk kitab  " + removedFirst);
        System.out.println("son kitab  " + removedLast);


        for(String kitab : bookQueue){
            System.out.println(kitab);
        }
    }
}
