//CircularQue is implemented to reduce the time complexity while removing an element from O(N) to O(1) 
public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;


    // Constructor for default queue size
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    

    // Constructor for custome queue size
    public CircularQueue(int size){
        this.data = new int[size];
    }


    //Function to insert an item into CircularQueue
    public boolean insert(int item){
        if(isFull()){
            // System.out.println("Queue is fill");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    
    //Function to remove an item from CircularQueue
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    //Function to display
    public void display(){

        if(isEmpty()){
            System.out.println("Empty queue");
            return;
        }

        int i = front;

        do{
            System.out.print(data[i++] +" -> ");
            i = i%data.length;
        }while(i!=end);
        System.out.println("END");
    }


    // Function to return true if end is full
    public boolean isFull(){
        return size == data.length; //end pointer is at last index
    }


    // Function to return true if end is empty
    public boolean isEmpty(){
        return size == 0; //end pointer is at -1 index
    }

    public static void main(String[] args) {
        CircularQueue cqueue = new CircularQueue();
            cqueue.insert(2);
            cqueue.insert(5);
            cqueue.insert(6);
            cqueue.insert(9);
            cqueue.insert(11);
            cqueue.insert(13);
            cqueue.insert(15);
            cqueue.insert(17);

            cqueue.display();
            
            System.out.println(cqueue.remove());
            System.out.println(cqueue.remove());

            System.out.println(cqueue.remove());
            cqueue.insert(17);
            cqueue.insert(19);
            System.out.println(cqueue.remove());
            cqueue.insert(200);
            cqueue.insert(200);
            cqueue.insert(200);
            cqueue.insert(200);



            cqueue.display();
    }
}
