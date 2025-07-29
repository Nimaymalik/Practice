
public class ReverseInKGroup {
    public static ListNode reverseInK(ListNode head, int k) {
        // count the linked list
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }

        // creating the dummy Linked list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prvGroup = dummy;

        while (count >= k) {
            ListNode curr = prvGroup.next;
            ListNode next = curr.next;

            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prvGroup.next;
                prvGroup.next = next;
                next = curr.next;

            }
            prvGroup = curr;
            count -= k;

        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode head1 = reverseInK(head, 2);
        ReverseLL.display(head1);
    }

}
