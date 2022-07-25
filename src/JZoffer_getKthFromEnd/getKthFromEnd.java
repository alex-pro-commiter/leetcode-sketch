package JZoffer_getKthFromEnd;
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast=head,slow=head;
        while (fast!=null&&k>0){
            fast=fast.next;
            k--;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
