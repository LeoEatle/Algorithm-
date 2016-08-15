package StackAndQueue;

/**
 * Created by leoeatle on 16/8/15.
 */
//
//编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。
//给定一个操作序列ope及它的长度n，其中元素为正数代表push操作，为0代表pop操作，保证操作序列合法且一定含pop操作，请返回pop的结果序列。
//测试样例：
//[1,2,3,0,4,0],6
//返回：[1,2]

import java.util.*;

public class TwoStack {
    public int[] twoStack(int[] ope, int n){
        //解法,实现两个stack,stack1专门用来压入数据,stack2专门用来拿数据,
        // 先把数组中所有非0的数据压入stack1,用count计算遇到0的数量,然后根据count从stack2弹出数据
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        int count = 0;
        int[] result;
        //遍历数组压入数据
        for (int i = 0; i < ope.length; i++) {
            if (ope[i] == 0){
                count++;
            }
            else if(ope[i] != 0){
                stack1.push(ope[i]);
            }
        }
        //将stack1中的数据倒入stack2
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        result = new int[count];
        //根据COUNT弹出数据
        for (int i = 0; i < count; i++) {
            result[i] = stack2.pop();
        }
        return result;


    }
}
