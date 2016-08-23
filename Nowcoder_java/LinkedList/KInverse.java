package LinkedList;
import java.util.*;


public class KInverse {
    public ListNode inverse(ListNode head, int k) {
        // write code here
        if(head == null || k == 1 || head.next == null){
            return head;
        }
        Stack<Integer> stack = new Stack<Integer>();
        ListNode cur = new ListNode(head.val);
        ListNode newHead = cur;
        ListNode next = null;
        
        while(head!=null){
            next = head;
            int flag = 1;
            
            for(int i = 0; i < k; i++){
            	   
                if(head == null){
                    flag = 0;
                    break;
                }
                stack.push(head.val); 
                head = head.next;
            }
            if(flag == 1){
                while(!stack.empty()){
                	cur.next = new ListNode(stack.pop());
                	cur = cur.next;    
                }
            }
            else if (flag == 0){
                cur.next = next;
                break;
            }
            
            
        }
        return newHead.next;
    }
}