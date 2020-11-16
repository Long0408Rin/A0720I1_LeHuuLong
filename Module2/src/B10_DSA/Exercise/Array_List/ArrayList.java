package B10_DSA.Exercise.Array_List;
import java.util.Arrays;

public class ArrayList<E> {
    int size = 0;

    static final int DEFAULT_CAPACITY = 10;
    private Object[] data;

    public ArrayList(){
        data = new Object[DEFAULT_CAPACITY];
    }
    public ArrayList(int capacity ) {
        if (capacity >= 0) {
            this.data = new Object[capacity];
        }else{
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity >= 0){
            int newSize = this.data.length;
            data = Arrays.copyOf(data, newSize);
        }else{
            throw new IllegalArgumentException("minCapacity");
        }
    }

    public int size() {
        return this.size;
    }

    public void clear(){
        size = 0;
        for(int i =0; i<= data.length;i++){
            data[i] =null;
        }
    }

    public boolean add(E element){
        if(data.length == size){
            this.ensureCapacity(5);
        }
        data[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index){
        if(index > data.length){
            throw new IllegalArgumentException("index"+ index);
        }else if(data.length >= size){
             this.ensureCapacity(5);
        }
        if(data[index] == null) {
            data[index] = data[index + 1];
        }
        data[index] = element;
        size++;
    }

}
