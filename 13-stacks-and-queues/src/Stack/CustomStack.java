package Stack;

public class CustomStack {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.arr = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        arr[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
       int removed = arr[ptr];
       ptr--;
       return removed;
        // return arr[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return arr[ptr];
    }

    public boolean isFull() {
        return ptr == arr.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
