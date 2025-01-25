public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    private int ptr = -1;

    // Constructor for default stack size
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    
    // Constructor for custome stack size
    public CustomStack(int size){
        this.data = new int[size];
    }
 

    // Function to push an item
    public boolean push(int value) throws Exception{

        if(isFull()){
            throw new Exception("Index out of bounds kp");
            // return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }


    // Pop an item from the stack
    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;

        return data[ptr--];
    }


    // Peek from the stack which returns the top element of the stack
    public void peek(){
        System.out.println(data[ptr]);
    }


    // Function to return true if ptr is full
    public boolean isFull(){
            return ptr == data.length -1; //pointer is at last index
    }

    // Function to return true if ptr is empty
    public boolean isEmpty(){
        return ptr == -1; //pointer is at -1 index
    }


    // Function to display the stack
    public void display(){

        for(int i = 0; i<= ptr; i++){
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) throws Exception{
        DynamicStack stack = new DynamicStack();
        stack.push(10);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(100);
        stack.push(1);
        stack.push(15);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
         
        System.out.println(stack.pop());
    }
}