//Creating a stack using one queue
// Approach is pushing an element to the queue, and then the second element. Now pop the first element from the stack 
// And then push the popped item into the same queue
// Repeat same for all the items except the item that's just pushed into queue
// That's it, now it acts like a stack

import java.util.LinkedList;
import java.util.Queue;

public class StackWithSingleQueue {

    Queue<Integer> q = new LinkedList<>();
    

    // push an element into queue and then pop it and then add again to make it work as a stack
    public void push(int x){

        int size = q.size();
        q.add(x);

        for(int i = 0; i < size; i++){
            q.add(q.remove());
        }
    }


    //Pop an element, since we already exchanged the queue elements, we can just pop from the queue
    public int pop(){

        if(q.isEmpty()) {
            System.out.println("No Elements");
            return -1;
        }
        return q.remove();
    }


    // Top of the stack
    public int top(){
        return q.peek();
    }


    // Empty check
    public boolean empty(){
        if(q.size() == 0){
            return true;
        }
        else return false;
    }

    // Display stack
    public void display(){
        for(int i = 0; i< q.size(); i++){
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackWithSingleQueue s = new StackWithSingleQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
