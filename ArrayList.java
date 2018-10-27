public class ArrayList implements List {
    private Object [] arr; //initialize the data that will be used in ArrayList constuctor
    private int size;

    public ArrayList(){
        arr = new Object[10]; // array created of Object type and size of 10 when the constructor is called
        size = 0;
    }

    //when array is full it will double size
    public void growArr(){
        Object [] newArray = new Object[arr.length * 2];
        for(int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        arr = newArray;
    }

    //function will object to the end of the array
    public void add(Object obj){
        if(size == arr.length){
            growArr();
        }
        arr[size] = obj;
        size++;

    }

    //will add obj to pos which is related to index
    public void add(int pos, Object obj){
        if(size == arr.length){
            growArr();
        }
        if(pos == size)
            arr[pos] = obj;
        else{
            Object [] newArray = new Object[arr.length];
            for(int i = 0; i < pos;i++){
                newArray[i] = arr[i];
            }
            newArray[pos] = obj;
            for(int k = 0; k < arr.length; k++){
                newArray[k+1] = arr[k];
            }
        }
        size++;
    }

    //returns what element is passed
    public Object get(int pos) {
        return arr[pos];
    }

    //removes element from arraylist at position passed in
    public Object remove(int pos){
        Object [] newArray = new Object[arr.length];
        Object obj = arr[pos];
        for(int i = pos + 1; i < size; i++){
            if(i < pos)
                newArray[i] = arr[i];
            else
                newArray[i] = arr[i+1];
        }
        size--;
        arr = newArray;
        return obj;
    }
    //returns size of arrayList
    public int size(){
        return size;
    }

}
