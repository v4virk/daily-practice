//stack implementation using arraylist
// array list functions add, remove ,get:    size of the list : list.size() -1
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack_arraylist {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        // f the stack is empty
        public boolean isEmpty() {
            return list.isEmpty();
        }

        // push 
        public void push(int data) {
            list.add(data);
        }

        // pop 
        public int pop() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            return list.remove(list.size() - 1);
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            return list.get(list.size() - 1);
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

