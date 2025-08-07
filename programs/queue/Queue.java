// implementation of simple queue in java
// so we ll be using classes for creation of the queue

public class Queue{
    int front , rear, size;
    int[] q_array;

    //note :
    //size here tells us that how many values we can be stored in a queue
    // fixe value when you create a queue

    //constructor creation for value intialization
    public Queue(int size){
        this.size = size; // size of the queue
        front = -1; // ponting the first element and the current size of the queue
        rear = -1; // pointing to the last element
        
        q_array = new int[this.size];
    }

    // function to check the ques is full or not `

    boolean isFull(){
        return (rear == size - 1 ); 
    }

    boolean isEmpty(){
        return (front == -1);
    }


    // addition and deletion of the elements in queue 
    
    public void enqueue(int data){
        if(isFull()){
            System.out.println("The queue is full , can't add the element to the queue \t: \t"+ data);
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear++;
        q_array[rear] = data;
        System.out.println("element added to the queue \t: \t"+data);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }

        int element = q_array[front]; // get the front elemnt 

        if(front == rear){
            front = -1;
            rear = -1;

        }
        else{
            front++;
        }
        System.err.println("the element dequeued \t: \t"+element);
        return element;

    }

    // get the element without removing it 

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }
        return q_array[front];

    }


    // all the element in a queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(q_array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();  // Output: 10 20 30
        queue.dequeue();
        queue.display();  // Output: 20 30

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.display();  // Output: 20 30 40 50 60

        queue.enqueue(70); // Queue full, cannot enqueue
    }







}