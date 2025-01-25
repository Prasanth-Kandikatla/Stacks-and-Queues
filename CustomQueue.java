public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    private int end = 0;

    // Constructor for default queue size
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    
    // Constructor for custome queue size
    public CustomQueue(int size){
        this.data = new int[size];
    }


    //Function to insert an item into queue
    public boolean insert(int value) throws Exception{

        if(isFull()){
            throw new Exception("Index out of bounds kp");
            // return false;
        }
        
        data[end] = value;
        end++;
        return true;
    }


    //Function to remove an item from queue
    public int remove()throws Exception{

        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[0];
        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
        
    }
    // Function to return true if end is full
    public boolean isFull(){
            return end == data.length; //end pointer is at last index
    }

    // Function to return true if end is empty
    public boolean isEmpty(){
        return end == 0; //end pointer is at -1 index
    }


    // Function to display the stack
    public void display(){

        for(int i = 0; i< end; i++){
            System.out.print(data[i]+ " <- ");
        }
        System.out.println("END");
    }

    //Main method
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue();

        queue.insert(3);
        queue.insert(5);
        queue.insert(2);
        queue.insert(11);
        queue.insert(31);
        queue.display();
        System.out.println(queue.remove());
        queue.display();

    }
}
