//This Class is to dynamically increase the size of the Stack(Infinite Stack)

public class DynamicStack extends CustomStack {
    
    //class constructor
    public DynamicStack(){
        super(); //It will call CustomStack
    }

    public DynamicStack(int size){
        super(size); //It will call CustomStack(int size)
    }

    @Override
    public boolean push(int value) throws Exception {


        //This handles the stack size increment
        if(isFull()){
            //Double the array size
            int[] temp = new int[data.length * 2];

            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        //This handles the push after increment of stack size
        //Insert item
        return super.push(value);
    }

    
}
