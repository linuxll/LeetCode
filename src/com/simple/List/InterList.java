package com.simple.List;


import java.util.HashSet;
import java.util.Set;

//160.相交链表
public class InterList {
    /**
     * 哈希表法
     * 因为两个链表位相交链表，所以相交部分的引用相同
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curNode=headA;
        Set<ListNode> set=new HashSet<>();
        while(curNode!=null){
            set.add(curNode);
            curNode=curNode.next;
        }
        curNode=headB;
        while (curNode!=null){
            if(set.contains(curNode)){
                return curNode;
            }
            curNode=curNode.next;
        }
        return null;
    }

    /**
     * 双指针法
     * @param headA
     * @param headB
     * @return
     */
    public ListNode get(ListNode headA,ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        ListNode head1=headA;
        ListNode head2=headB;
        while(head1!=head2){
            if(head1.next!=null){
                head1=head1.next;
            }else{
                head1=headB;
            }
            if(head2.next!=null){
                head2=head2.next;
            }else{
                head2=headA;
            }
        }
        return headA;
    }
}
