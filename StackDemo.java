
import java.util.*; // Imports all classes and interfaces at a time inside the java.util package

class StackDemo{
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(7);
        stack.push(6);
        stack.push(2);
        stack.push(13);
        stack.push(22);
        // System.out.println(stack.size());

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(5);
        queue.add(4);
        queue.add(9);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);



        
    }
}