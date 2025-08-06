//push the element at the bottom of the stack


import java.util.*;;



public class Q1 {
    static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        pushAtBottom(4,s);

        while (!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        System.out.println(s.peek());
    
    }
}

