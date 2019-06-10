package queueWithStacks;


public class QueueWithStacks {

    private Stack stack1;
    private Stack stack2;
    private Node front;
    private Node back;
    private int temp;


    public QueueWithStacks(){
        stack1 = new Stack();
        stack2 = new Stack();
    }

    /**
     * Inserts value into the PseudoQueue, using a first-in, first-out approach.
     */
    public void enqueue(int value){
        front = new Node(value);
        stack1.push(front.data);
    }

    /**
     * This extracts a value from the PseudoQueue, using a first-in, first-out approach
     * @return
     */
    public int dequeue(){
        if(stack2 != null){
            stack2.pop();
        }
        while(front != null){
            temp = stack1.pop();
            stack2.push(temp);
            return stack1.pop();
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueWithStacks queueWithStacks = new QueueWithStacks();
        queueWithStacks.enqueue(4);
        System.out.println(queueWithStacks.front.data);

        queueWithStacks.enqueue(6);
        System.out.println(queueWithStacks.front.data);
        queueWithStacks.enqueue(10);

        System.out.println(queueWithStacks.front.data);
//        queueWithStacks.dequeue();
//        System.out.println(queue/WithStacks.front.data);



    }
}
