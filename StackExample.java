import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Cherry");
        stringStack.push("Date");
        stringStack.push("Elderberry");

        while (!stringStack.isEmpty()) {
            String element = stringStack.pop();
            System.out.println(element);
        }
    }
}
