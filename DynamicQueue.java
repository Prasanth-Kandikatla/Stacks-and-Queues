//This Class is to dynamically increase the size of the Queue(Infinite queue)

public class DynamicQueue extends CircularQueue {

    //class constructor
    public DynamicQueue(){
        super(); //It will call CustomStack
    }

    public DynamicQueue(int size){
        super(size); //It will call CustomStack(int size)
    }

    @Override
    public boolean insert(int value) {

        //This handles the stack size increment
        if(isFull()){
            //Double the array size
            int[] temp = new int[data.length * 2];

            for(int i = 0; i < data.length; i++){
                temp[i] = data[(front+i) % data.length];
            }

            front = 0;
            end = data.length;
            data = temp;
        }

        //This handles the inserting after increment of stack size
        //Insert item
        return super.insert(value);
    }
}
