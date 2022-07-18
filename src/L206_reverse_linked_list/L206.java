package L206_reverse_linked_list;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class L206 {
    public static ListNode create() {
        ListNode head=new ListNode(0);
        ListNode cur=head;
        for (int i = 0; i < 10; i++) {
            cur.next=new ListNode(i+1);
//            System.out.println(cur.val);
            cur=cur.next;
        }
        return head;
    }
    static ListNode reverse(ListNode node){
        ListNode prev=null;
        ListNode cur = node;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = create();
        head = reverse(head);
//        while (head!=null){
//            System.out.println(head.val);
//            head=head.next;
//        }
        for (ListNode l=head;l!=null;l=l.next){
            System.out.println(l.val);
        }

//        System.out.println(front.val+front.next.val);
    }
}
