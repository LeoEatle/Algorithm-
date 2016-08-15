package StackAndQueue;

/**
 * Created by leoeatle on 16/8/15.
 */
//
//请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，但不得将元素复制到别的数据结构中。
//        给定一个int[] numbers(C++中为vector<int>)，其中第一个元素为栈顶，请返回排序后的栈。请注意这是一个栈，意味着排序过程中你只能访问到第一个元素。
//        测试样例：
//        [1,2,3,4,5]
//        返回：[5,4,3,2,1]

import java.util.*;
public class TwoStack2 {
    public ArrayList<Integer> twoStacksSort(int[] numbers){
        Stack<Integer> stack1 = new Stack<Integer>();
        int l = numbers.length;
        for (int i = numbers.length - 1; i >= 0; i--) {
            stack1.push(numbers[i]);
        }
        Stack<Integer> stack2 = new Stack<Integer>();
        for (int j = 0; j < l; j++) {
            if (stack2.isEmpty() || stack2.peek() < stack1.peek()){
                stack2.push(stack1.pop());
            }
            else {
                //用一个临时数存放需要插入的数字
                int temp = stack1.pop();
                int count = 0;

                while (stack2.isEmpty()||stack2.peek() > temp){//只要stack2中的栈顶元素依然是大于这个要插入的,就把它先push回stack1
                    if(stack2.isEmpty()){//注意这里一定要判断stack2会不会已经空了,空了的话就可以把临时整数放进去了
                        break;
                    }
                    stack1.push(stack2.pop());
                    count++;
                }
                stack2.push(temp);//插进去
                while (count > 0){
                    stack2.push(stack1.pop());//放回去
                    count--;
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            result.add(stack2.pop());
        }
        return result;
    }
}
