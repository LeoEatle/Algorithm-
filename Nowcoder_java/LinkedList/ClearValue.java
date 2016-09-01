package LinkedList;

/**
 * Created by leoeatlesair on 16/8/24.
 */
import java.util.*;
public class ClearValue {
    public static ListNode clear(ListNode head, int val) {
        // write code here
        if(head == null){
            return head;
        }

        ListNode next = null;
        ListNode tail = null;
        ListNode newHead = tail;

        while(head!=null){
            next = head.next;
            if(next!=null){
                head.next = null;
            }

            if(head.val == val){
                head = next;
            }
            else if (head.val != val){
                if(newHead == null){
                    newHead = head;
                    tail = head;
                }
                else{
                    tail.next = head;
                    tail = tail.next;
                    /*
                    * 注意这里一定不能是tail = head; tail = tail.next;
                    * 假如tail一开始是指向1,然后tail = tail.next,就指向1的next,也就是null
                    * 下一个循环,tail被赋值2,但这并不意味着1.next就变成2了,1.next没有任何改变,改变的仅仅是tail所指向的地址,变成了存放2节点的地址
                    * 在1的那块内存中,什么都没有动,1.next依然指向null
                    *
                    * */
                }

                head = next;
            }
        }
        if(newHead == null){
            return null;
        }
        return newHead;
    }
}