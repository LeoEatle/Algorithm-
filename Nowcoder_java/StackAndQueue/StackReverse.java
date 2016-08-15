package StackAndQueue;

/**
 * Created by leoeatle on 16/8/15.
 */
//
//实现一个栈的逆序，但是只能用递归函数和这个栈本身的pop操作来实现，而不能自己申请另外的数据结构。
//        给定一个整数数组A即为给定的栈，同时给定它的大小n，请返回逆序后的栈。
//        测试样例：
//        [4,3,2,1],4
//        返回：[1,2,3,4]


import java.util.*;

public class StackReverse {
    public int[] reverseStack(int[] A, int n){
        Stack<Integer> stack1 = new Stack<Integer>();
        int[] result = new int[A.length];
        //先压入栈
        for (int i = 0; i < A.length; i++) {
            stack1.push(A[i]);
        }
        //按道理是应该实现一个getBottom的方法把栈底的数据用递归函数拿出来,但是,这里给的是个数组,光装进去就略麻烦
        for (int j = 0; j < A.length ; j++) {
            result[j] = stack1.pop();
        }
        return result;
    }
}
