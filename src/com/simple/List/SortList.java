package com.simple.List;

public class SortList {
    /**
     * 递归
     * @param l1
     * @param l2
     * @return
     */
    public ListNode sol(ListNode l1,ListNode l2){
        ListNode temp;
        if(l1==null&&l2==null){
            return null;
        }else if(l1==null&&l2!=null){
            return l2;
        }else if(l1!=null&&l2==null){
            return l1;
        }
        ListNode next1=l1.next;
        ListNode next2=l2.next;
        if(l1.val<=l2.val){
            temp=l1;

            next2=l2;
            temp.next=sol(next1,next2);
        }else{
            temp=l2;
            next1=l1;

            temp.next=sol(next1,next2);
        }
        return temp;
    }

    /**
     * 迭代
     */

}
