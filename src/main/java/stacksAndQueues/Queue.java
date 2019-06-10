package stacksAndQueues;

public class Queue {

    private Node front;
    private Node back;
    private Node temp;

    public Queue(){
    }

    public void enqueue(int value){
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

    public int dequeue(){
        if(front == null){
            throw new NullPointerException("Queue is empty");
        }
        else{
            temp = front;
            front= front.next;
            return temp.data;
        }
    }

    public int peek(){
        if(front == null){
            throw new NullPointerException("Queue is empty");
        }
        else{
            return front.data;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        System.out.println(queue.peek());

        queue.enqueue(45);
        queue.dequeue();
        System.out.println(queue.peek());
    }


}
