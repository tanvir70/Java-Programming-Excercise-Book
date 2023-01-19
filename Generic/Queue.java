package book.Generic;

public class Queue <T>{
    private T[] array;
    private int size;
    private int head;
    private int tail;

    public Queue (int capacity){
        array = (T[]) new Object [capacity];
        size = 0;
        head = 0;
        tail = 0;
    }

    public void enqueue( T element){
        if ( size == array.length){
            throw new IllegalStateException("Cannot enqueue to a full queue.");
        }
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public T dequeue(){
        if ( size == 0){
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        }
        T element = array[head];
        head = ( head + 1) % array.length;
        size--;
        return element;
    }

    public T peek() {
        if ( size == 0){
            throw new IllegalStateException("Cannot peek at an empty queue.");
        }
        return array[head];
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);


        int size = queue.getSize();  // Returns 3
        System.out.println("size = " + size);
        int element = queue.peek();  // Returns 1
        System.out.println("element = " + element);
    }

}

