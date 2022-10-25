import java.util.Deque;
import java.util.ArrayDeque;

public class MyStack {
    Deque<Integer> s = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        s.addFirst(x);
    }
    
    public int pop() {
        if(s.isEmpty()) {
            return -1;
        }
        return s.pollFirst();
        
    }
    
    public int top() {
        if(s.isEmpty()) {
            return -1;
        }
        return s.peekFirst();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}
