package L160_intersection_of_two_linked_lists;

//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class L160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode pA=headA,pB=headB;
        while (pA!=pB){
            if (pA!=null){
                pA=pA.next;
            }else pA=headB;
            if (pB!=null){
                pB=pB.next;
            }else pB=headA;
        }
    return pA;
    }
}
