package com.medium.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

//2.两数相加
class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode=new ListNode();
        ListNode head=listNode;
        int num=0;
        while(true){
            int temp;

            if(l1==null){
                temp= l2.val+num;
                l2=l2.next;
            }else if(l2==null){
                temp= l1.val+num;
                l1=l1.next;
            }else{
                temp=l1.val+l2.val+num;
                l1=l1.next;
                l2=l2.next;
            }
            if(temp>9){
                num=temp/10;
                temp=temp%10;
            }else{
                num=0;
            }
            listNode.val=temp;

            if(l1==null&&l2==null){
                if(num==0){

                    break;

                }else{
                    listNode.next=new ListNode();
                    listNode=listNode.next;
                    listNode.val=num;
                    break;
                }
            }
            listNode.next=new ListNode();
            listNode=listNode.next;
        }
        return head;
    }
}
