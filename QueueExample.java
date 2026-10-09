import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Date");
        queue.add("Elderberry");
      
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
