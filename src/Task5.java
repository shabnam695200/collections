import java.util.Stack;

public class Task5 {
    public static void main(String[] args) {
        String metn = "Salam necesen";
        Stack<Character> stack = new Stack<>();

        for(char a : metn.toCharArray()){
            stack.push(a);
        }

        StringBuilder cevrilmisMetn = new StringBuilder();


        while (!stack.isEmpty()){
            cevrilmisMetn.append(stack.pop());
        }

        System.out.println(metn);
        System.out.println(cevrilmisMetn);




    }
}
