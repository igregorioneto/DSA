package easy;

import java.util.ArrayList;

public class MyStack {
    ArrayList<Integer> stack;
    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        return stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public boolean empty() {
        return stack.size() == 0 ? true : false;
    }
}
