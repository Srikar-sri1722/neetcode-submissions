/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode prev=l1;
        int carry=0;
        while(temp1!=null||temp2!=null){
            int val1=0;
            int val2=0;
            if(temp1!=null)val1=temp1.val;
            if(temp2!=null)val2=temp2.val;
            int sum=val1+val2+carry;
            carry=sum/10;
            if(temp1!=null){
                temp1.val=sum%10;
                prev=temp1;
                temp1=temp1.next;
            }
            else{
                prev.next=new ListNode(sum%10);
                prev=prev.next;
            }
            if(temp2!=null){
                temp2=temp2.next;
            }
        }
        if(carry!=0){
            ListNode a=new ListNode(carry);
            prev.next=a;
        }
        return l1;
    }
}
