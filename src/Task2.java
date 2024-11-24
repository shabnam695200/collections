import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        Queue<String> biletNovbe = new LinkedList<>();
        biletNovbe.add("Elvin");
        biletNovbe.add("Cavid");
        biletNovbe.add("Asif");
        biletNovbe.add("Ramil");
        biletNovbe.add("Shabnam");

        while (!biletNovbe.isEmpty()){
            String novbedeki = biletNovbe.poll();

            System.out.println("novbedeki adam " + novbedeki);


            System.out.println("novbe " + biletNovbe);
        }
    }
}
