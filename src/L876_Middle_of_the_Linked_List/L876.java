package L876_Middle_of_the_Linked_List;

public class L876 {
    public static void main(String[] args) {
        class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }
        class Solution {
            public ListNode middleNode(ListNode head) {
                ListNode slow = head, fast = head;
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow;
            }
        }
    }
}
