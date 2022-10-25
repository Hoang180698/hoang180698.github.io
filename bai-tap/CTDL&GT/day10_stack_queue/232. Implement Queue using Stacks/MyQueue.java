
import java.util.Stack;

import javax.print.attribute.standard.Sides;

public class MyQueue {
    private Stack<Integer> s = new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
       
        Stack<Integer> s1 = new Stack<>();
        while(!s.isEmpty()) {
            s1.add(s.pop());
        }
        s.push(x);
        while(!s1.isEmpty()){
            s.add(s1.pop());
        }

    }
    
    public int pop() {
        if (s.isEmpty()) {
            return -1;
        }
        return s.pop();
    }
    
    public int peek() {
        if (s.isEmpty()) {
            return -1;
        }
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}
