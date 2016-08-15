/**
 * Created by leoeatle on 16/8/6.
 */

//定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

import java.util.*;

public class StackMin {
    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        dataStack.push(node);
        if (node < minStack.peek() || minStack.empty()){
            minStack.push(node);
        }
        else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (dataStack.empty()){
            throw new RuntimeException("Stack is empty!");
        }
        minStack.pop();
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        if (minStack.empty()){
            throw new RuntimeException("Stack is empty");
        }
        return minStack.pop();
    }
}
