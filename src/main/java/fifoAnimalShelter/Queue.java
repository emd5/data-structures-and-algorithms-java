package fifoAnimalShelter;

public class Queue<T> {

    protected Node<T> front;
    protected Node<T> back;
    protected Node<T> temp;

    public Queue(){
        this.front = back;
        back = null;
    }

    public void enqueue(T value){
        temp = new Node(value);
        if(this.back == null){
            this.front = temp;
            this.back = temp;
        }
        else{
            this.back.next = temp;
            this.back = temp;
        }
    }

    public T dequeue(){
        if(this.front == null){
            throw new NullPointerException("Queue is empty");
        }
        else{
            temp = this.front;
            this.front= front.next;
            return temp.data;
        }
    }

    public T peek(){
        if(this.front == null){
            throw new NullPointerException("Queue is empty when peeking");
        }
        else{
            return this.front.data;
        }
    }

}
