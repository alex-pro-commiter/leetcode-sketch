package L142_linked_list_cycle_ii;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class L142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        for(ListNode node=head;node!=null;node=node.next){
            if (set.contains(node)){
                return node;
            }else set.add(node);
        }
        return null;
    }
}
