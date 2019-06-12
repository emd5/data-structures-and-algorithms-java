package fifoAnimalShelter;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;
    private Node<T> temp;

    public Queue(){
    }

    public void enqueue(T value){
        temp = new Node(value);
        if(back == null){
            front = temp;
            back = temp;
        }
        else{
            back.next = temp;
            back = temp;
        }
    }

    public T dequeue(){
        if(front == null){
            throw new NullPointerException("Queue is empty");
        }
        else{
            temp = front;
            front= front.next;
            return temp.data;
        }
    }

    public T peek(){
        if(front == null){
            throw new NullPointerException("Queue is empty");
        }
        else{
            return front.data;
        }
    }

}
