package stacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    public Node<T> front;
    public Node<T> back;
    public Node<T> temp;

    public Queue(){
    }

    public void enqueue(T value){
        Node<T> newNode = new Node(value);
        temp = newNode;
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

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Queue q = new Queue();
        q.enqueue(4);
        q.enqueue(8);
        q.enqueue(17);
        q.enqueue(24);

        while(q.front != null){
            list.add((Integer) q.dequeue());
        }
        System.out.println(list);
    }
}
