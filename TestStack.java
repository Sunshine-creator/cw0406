import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack <Integer> stack  = new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        int result =  stack.pop();
        System.out.println(result);
        System.out.println(stack.peek());
    }
}
