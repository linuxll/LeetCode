package com.simple.List;

import java.util.*;


public class DelList {
    /**
     * set集合
     * @param head
     * @return
     */
    public ListNode remove(ListNode head) {
        Set<Integer> set=new HashSet<>();
        ListNode temp=head;
        if(head==null){
            return head;
        }
        while(temp!=null){
            set.add(temp.val);
            if(temp.next!=null){
                if(set.add(temp.next.val)){
                    temp=temp.next;
                }else{
                    temp.next=temp.next.next;//当next的数字重复时，将其覆盖，重新进行判断
                }
            }else{
                break;
            }
        }
        return head;
    }

    /**
     * 双循环
     * @param head
     * @return
     */
    public ListNode BoLi(ListNode head){
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur;
            while(temp.next!=null){
                if(cur.val==temp.next.val){
                    temp.next=temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
            cur=cur.next;
        }
        return head;
    }
}