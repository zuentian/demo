package time2019;

import java.util.List;

/*
给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:

输入: 1->1->2
输出: 1->2
示例 2:

输入: 1->1->2->3->3
输出: 1->2->3

 */
public class DeleteDuplicates {


    public static void main(String[] args) {


        ListNode node1=new ListNode(1);
        node1.next=new ListNode(1);
        node1.next.next=new ListNode(2);
        node1.next.next.next=new ListNode(2);
        node1.next.next.next.next=new ListNode(3);

        System.out.println(f(node1));
    }

    public static ListNode f(ListNode head){

        ListNode l=new ListNode(0);
        l=head;
        while(l!=null&&l.next!=null){

            if(l.next.val==l.val){
                l.next=l.next.next;
            }else{
                l=l.next;
            }
        }
        System.out.println(head);
        return head;

    }

}
