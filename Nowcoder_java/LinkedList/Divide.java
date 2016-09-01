package LinkedList;

import java.util.*;

import LinkedList.ListNode;
import LinkedList.ClearValue;

public class Divide {
    public static ListNode listDivide(ListNode head, int val) {
        // write code here
        if(head.next == null||head == null){
            return head;
        }
        ListNode small= null;
        ListNode smallHead = null;
        ListNode large = null;
        ListNode largeHead = null;
        ListNode cur = null;
        while(head != null){
        	cur = head.next;
        	head.next = null;
            if(val >= head.val){
                if(small == null){
                    smallHead = head;
                    small = head;
                }
                else{
                	small.next = head;
                    small = head;
                }
            }
            else if (val < head.val){
            	if(large == null){
                    largeHead = head;
                    large = head;
                }
            	else{
            		large.next = head;
                    large = head;
            	}
            }
            head = cur;
        }
        if(smallHead == null){
           return largeHead;
        }
        else if (largeHead == null){
            return smallHead;
        }
        else {
            small.next = largeHead;
            return smallHead;
        }
    }
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	int n = 4;
    	ListNode head = null;
    	ListNode temp = null;
    	ListNode tail = null;
    	System.out.println("请输入链表：");
    	while (n>0){
    		if(head == null){
    			tail = new ListNode(scanner.nextInt());
    			head = tail;
    			
    		}
    		else{
    			temp = new ListNode(scanner.nextInt());
    			tail.next = temp;
    			tail = temp;
    		}
    		n--;
    	}
    	System.out.println("请输入要比较的值：");
    	int val = scanner.nextInt();
    	ListNode answer = ClearValue.clear(head,val);
    	while(answer != null){
    		System.out.println(answer.val);
    		answer = answer.next;
    	}
    	
    }
}