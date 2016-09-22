package JianZhiOffer;

import com.sun.scenario.effect.Merge;

/**
 * Created by leoeatle on 16/9/17.
 */


public class Solution {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode pointResult = new ListNode(list1.val);
        ListNode point1 = list1;
        ListNode point2 = list2;
        ListNode result = pointResult;
        while(point1!=null&&point2 != null){
            if(point1.val<=point2.val){
                pointResult.next = new ListNode(point1.val);
                point1 = point1.next;

            }
            else if(point2.val<point1.val){
                pointResult.next = new ListNode(point2.val);
                point2 = point2.next;
            }
            pointResult = pointResult.next;
            //show(result);
        }
        if(point1 == null){
            pointResult.next = point2;
        }
        else if(point2 == null){
            pointResult.next = point1;
        }
        return result.next;

    }

    public static void main(String[] args){
        ListNode test = new ListNode(1);
        ListNode point = test;
        point.next = new ListNode(2);
        point = point.next;
        point.next = new ListNode(3);
        point = point.next;
        ListNode result = Merge(test, test);
        show(test);



    }

    public static void show(ListNode node){
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

}