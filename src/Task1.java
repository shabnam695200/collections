import java.util.LinkedList;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {
        Queue<String> telebeNovbe = new LinkedList<>();
        telebeNovbe.add("Elvin");
        telebeNovbe.add("Cavid");
        telebeNovbe.add("Asif");
        telebeNovbe.add("Ramil");
        telebeNovbe.add("Shabnam");

        System.out.println("cixarilan telebeler ");
        System.out.println(telebeNovbe.poll());
        System.out.println(telebeNovbe.poll());

        System.out.println("yerde qalan telebeler");
        for(String telebe : telebeNovbe){
            System.out.println(telebe);
        }
    }
}
