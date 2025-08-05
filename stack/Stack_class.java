// Stack implementation using linked list

public class Stack_class {
    //node class
    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    // stacking 
    static class Stack {
        private Node head;

        public boolean isEmpty(){
            return head == null;
        }

        //input values 

        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        //popping the value
        public int pop(){
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //returning the top value 
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Popping all elements:");
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println("Top element is: " + s.peek()); //print -1
        System.out.println("Popped element is: " + s.pop()); //print -1
        System.out.println("Top element after pop is: " + s.peek()); //print -1
        System.out.println("Is stack empty? " + s.isEmpty()); // print true
    }
}
