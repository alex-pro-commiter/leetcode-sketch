package L98_reverse_linked_list_ii;

//not done yet!!!
import java.util.ArrayList;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class L98 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;
        ListNode pre=dummyNode;
        for (int i = 0; i < left-1; i++) {
            pre=pre.next;
        }
        ListNode cur=pre.next;
        ListNode next;
//        1,2,3,4,5,6,7,8,9
        for (int i = 0; i <right-left ; i++) {
            next=cur.next;
            cur.next=next.next;
            next.next=pre.next;
            pre.next=next;
        }
        return dummyNode.next;
    }
}